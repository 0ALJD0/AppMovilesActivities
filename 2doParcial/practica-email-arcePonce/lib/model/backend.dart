import 'email.dart';

class Backend {
  /// Singleton pattern used here.
  static final Backend _backend = Backend._internal();

  factory Backend() {
    return _backend;
  }

  Backend._internal();

  /// Lista de correos estatico
  final _emails = [
    Email(
      id: 1,
      de: 'rocíodulcan@camtamte.com',
      asunto: 'SGata bajo la lluvia',
      fechaHora: DateTime(2022, 12, 03, 11, 19),
      cuerpoDelMensaje:
          'Amor lo sé no digas nada de verdad. Si ves alguna lagrma perdón.',
    ),
    Email(
      id: 2,
      de: 'elMaximoLidere@daddyYankee.com',
      asunto: 'La despedida',
      fechaHora: DateTime(2022, 12, 03, 11, 19),
      cuerpoDelMensaje:
          'Nunca lo olvides te sigo amando, hsta la muerte aquí estaré esperando.',
    ),
    Email(
      id: 3,
      de: 'elMaximoLidere@daddyYankee.com',
      asunto: 'Ella me levantó',
      fechaHora: DateTime(2022, 12, 03, 11, 19),
      cuerpoDelMensaje:
          'Me fallaste, abusaste, me dejaste, te burlaste, pero ella me rescató. LLora nena llora, las que juegan se quedan solas :v',
    ),
    Email(
      id: 3,
      de: 'theKing@DonOmar.com',
      asunto: 'Dile',
      fechaHora: DateTime(2022, 12, 03, 11, 19),
      cuerpoDelMensaje:
          'Cuentale, que te conoci bailando, cuentale, que te traigo loca, quiza te hable al oído como el ya no.',
    ),
    Email(
      id: 4,
      de: 'theKing@DonOmar.com',
      asunto: 'Salio el Sol',
      fechaHora: DateTime(2022, 12, 03, 11, 19),
      cuerpoDelMensaje:
          'Salió el sol, cuerpo bronceado y sus amigas buscaban acción, la canciónm que causa en ellas y sus cuerpos esa sensación ',

    ),
    Email(
      id: 5,
      de: 'JJ@elRuiseñor.america',
      asunto: 'Ayer y hoy',
      fechaHora: DateTime(2022, 12, 03, 11, 19),
      cuerpoDelMensaje:
          'Pero no importa si tú te burlaste de mi fiel cariño, mujer fatal, algún día, la tendrás tú, que pagar',
    ),
  ];

  ///
  /// Public API starts here :)
  ///

  /// Returns all emails.
  List<Email> getEmails() {
    return _emails;
  }

  /// Marks email identified by its id as read.
  void markEmailAsRead(int id) {
    final index = _emails.indexWhere((email) => email.id == id);
    _emails[index].leido = true;
  }

  /// Deletes email identified by its id.
  void deleteEmail(int id) {
    _emails.removeWhere((email) => email.id == id);
  }
}
