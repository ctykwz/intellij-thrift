// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.thrift.lang.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.plugins.thrift.lang.psi.impl.*;

public interface ThriftTokenTypes {

  IElementType BASE_TYPE = new ThriftElementType("BASE_TYPE");
  IElementType CONST = new ThriftElementType("CONST");
  IElementType CONST_LIST = new ThriftElementType("CONST_LIST");
  IElementType CONST_MAP = new ThriftElementType("CONST_MAP");
  IElementType CONST_VALUE = new ThriftElementType("CONST_VALUE");
  IElementType CPP_TYPE = new ThriftElementType("CPP_TYPE");
  IElementType CUSTOM_TYPE = new ThriftElementType("CUSTOM_TYPE");
  IElementType DEFINITION_NAME = new ThriftElementType("DEFINITION_NAME");
  IElementType DOUBLE_CONSTANT = new ThriftElementType("DOUBLE_CONSTANT");
  IElementType ENUM = new ThriftElementType("ENUM");
  IElementType ENUM_FIELD = new ThriftElementType("ENUM_FIELD");
  IElementType EXCEPTION = new ThriftElementType("EXCEPTION");
  IElementType FIELD = new ThriftElementType("FIELD");
  IElementType FIELD_ID = new ThriftElementType("FIELD_ID");
  IElementType FIELD_REQ = new ThriftElementType("FIELD_REQ");
  IElementType FIELD_TYPE = new ThriftElementType("FIELD_TYPE");
  IElementType FUNCTION = new ThriftElementType("FUNCTION");
  IElementType FUNCTION_TYPE = new ThriftElementType("FUNCTION_TYPE");
  IElementType INCLUDE = new ThriftElementType("INCLUDE");
  IElementType INT_CONSTANT = new ThriftElementType("INT_CONSTANT");
  IElementType LIST_SEPARATOR = new ThriftElementType("LIST_SEPARATOR");
  IElementType LIST_TYPE = new ThriftElementType("LIST_TYPE");
  IElementType MAP_TYPE = new ThriftElementType("MAP_TYPE");
  IElementType NAMESPACE = new ThriftElementType("NAMESPACE");
  IElementType NAMESPACE_SCOPE = new ThriftElementType("NAMESPACE_SCOPE");
  IElementType SEMUN_FIELD = new ThriftElementType("SEMUN_FIELD");
  IElementType SENUM = new ThriftElementType("SENUM");
  IElementType SERVICE = new ThriftElementType("SERVICE");
  IElementType SET_TYPE = new ThriftElementType("SET_TYPE");
  IElementType STRUCT = new ThriftElementType("STRUCT");
  IElementType THROWS = new ThriftElementType("THROWS");
  IElementType TYPEDEF = new ThriftElementType("TYPEDEF");
  IElementType UNION = new ThriftElementType("UNION");
  IElementType XSD_ATTRS = new ThriftElementType("XSD_ATTRS");
  IElementType XSD_FIELD_OPTIONS = new ThriftElementType("XSD_FIELD_OPTIONS");

  IElementType BLOCKCOMMENT = new ThriftElementType("BlockComment");
  IElementType COLON = new ThriftElementType(":");
  IElementType COMMA = new ThriftElementType(",");
  IElementType COMMENT = new ThriftElementType("Comment");
  IElementType EQUALS = new ThriftElementType("=");
  IElementType GT = new ThriftElementType(">");
  IElementType IDENTIFIER = new ThriftElementType("Identifier");
  IElementType INTEGER = new ThriftElementType("Integer");
  IElementType LEFTBRACE = new ThriftElementType("(");
  IElementType LEFTBRACKET = new ThriftElementType("[");
  IElementType LEFTCURLYBRACE = new ThriftElementType("{");
  IElementType LITERAL = new ThriftElementType("Literal");
  IElementType LT = new ThriftElementType("<");
  IElementType MINUS = new ThriftElementType("-");
  IElementType MULTIPLY = new ThriftElementType("Multiply");
  IElementType NUMBER = new ThriftElementType("Number");
  IElementType PLUS = new ThriftElementType("+");
  IElementType RIGHTBRACE = new ThriftElementType(")");
  IElementType RIGHTBRACKET = new ThriftElementType("]");
  IElementType RIGHTCURLYBRACE = new ThriftElementType("}");
  IElementType SEMICOLON = new ThriftElementType(";");
  IElementType STIDENTIFIER = new ThriftElementType("STIdentifier");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == BASE_TYPE) {
        return new ThriftBaseTypeImpl(node);
      }
      else if (type == CONST) {
        return new ThriftConstImpl(node);
      }
      else if (type == CONST_LIST) {
        return new ThriftConstListImpl(node);
      }
      else if (type == CONST_MAP) {
        return new ThriftConstMapImpl(node);
      }
      else if (type == CONST_VALUE) {
        return new ThriftConstValueImpl(node);
      }
      else if (type == CPP_TYPE) {
        return new ThriftCppTypeImpl(node);
      }
      else if (type == CUSTOM_TYPE) {
        return new ThriftCustomTypeImpl(node);
      }
      else if (type == DEFINITION_NAME) {
        return new ThriftDefinitionNameImpl(node);
      }
      else if (type == DOUBLE_CONSTANT) {
        return new ThriftDoubleConstantImpl(node);
      }
      else if (type == ENUM) {
        return new ThriftEnumImpl(node);
      }
      else if (type == ENUM_FIELD) {
        return new ThriftEnumFieldImpl(node);
      }
      else if (type == EXCEPTION) {
        return new ThriftExceptionImpl(node);
      }
      else if (type == FIELD) {
        return new ThriftFieldImpl(node);
      }
      else if (type == FIELD_ID) {
        return new ThriftFieldIDImpl(node);
      }
      else if (type == FIELD_REQ) {
        return new ThriftFieldReqImpl(node);
      }
      else if (type == FIELD_TYPE) {
        return new ThriftFieldTypeImpl(node);
      }
      else if (type == FUNCTION) {
        return new ThriftFunctionImpl(node);
      }
      else if (type == FUNCTION_TYPE) {
        return new ThriftFunctionTypeImpl(node);
      }
      else if (type == INCLUDE) {
        return new ThriftIncludeImpl(node);
      }
      else if (type == INT_CONSTANT) {
        return new ThriftIntConstantImpl(node);
      }
      else if (type == LIST_SEPARATOR) {
        return new ThriftListSeparatorImpl(node);
      }
      else if (type == LIST_TYPE) {
        return new ThriftListTypeImpl(node);
      }
      else if (type == MAP_TYPE) {
        return new ThriftMapTypeImpl(node);
      }
      else if (type == NAMESPACE) {
        return new ThriftNamespaceImpl(node);
      }
      else if (type == NAMESPACE_SCOPE) {
        return new ThriftNamespaceScopeImpl(node);
      }
      else if (type == SEMUN_FIELD) {
        return new ThriftSemunFieldImpl(node);
      }
      else if (type == SENUM) {
        return new ThriftSenumImpl(node);
      }
      else if (type == SERVICE) {
        return new ThriftServiceImpl(node);
      }
      else if (type == SET_TYPE) {
        return new ThriftSetTypeImpl(node);
      }
      else if (type == STRUCT) {
        return new ThriftStructImpl(node);
      }
      else if (type == THROWS) {
        return new ThriftThrowsImpl(node);
      }
      else if (type == TYPEDEF) {
        return new ThriftTypedefImpl(node);
      }
      else if (type == UNION) {
        return new ThriftUnionImpl(node);
      }
      else if (type == XSD_ATTRS) {
        return new ThriftXsdAttrsImpl(node);
      }
      else if (type == XSD_FIELD_OPTIONS) {
        return new ThriftXsdFieldOptionsImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
