package ast3;

// Interface Statement implemented by Declaration, Assignment and Sequence.
public interface Statement extends Node {
	String textRepresentation();
}
