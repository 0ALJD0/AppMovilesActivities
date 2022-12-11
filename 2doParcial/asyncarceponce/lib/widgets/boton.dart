import 'package:flutter/material.dart';

class Button extends StatefulWidget{
  const Button({super.key, required this.texto, required this.ninio,required this.ninio2});
  
  final Widget ninio;
  final Widget texto;
  final Widget ninio2;
  @override
  State<Button> createState() => _MyButtonState();
}
class _MyButtonState extends State<Button>{
  @override
  Widget build(BuildContext context) {
    return   Card(
        child: Padding(
          padding: const EdgeInsets.all(12.0),
          child: Center(
            child: Column(
                mainAxisSize: MainAxisSize.min,
                children: <Widget>[
                  widget.ninio,
                  const SizedBox(height: 10),
                  widget.texto,
                  widget.ninio2,
                ],
            ),
          ),
        ),
    );
  }
}