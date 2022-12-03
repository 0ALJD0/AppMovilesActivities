class Email {
  final int id;
  final String de;
  final String asunto;
  final DateTime fechaHora;
  final String cuerpoDelMensaje;
  bool leido;

  Email({
    required this.id,
    required this.de,
    required this.asunto,
    required this.fechaHora,
    required this.cuerpoDelMensaje,
    this.leido = false,
  });
}
