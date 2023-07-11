#
# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: spark/connect/example_plugins.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database

# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from pyspark.sql.connect.proto import relations_pb2 as spark_dot_connect_dot_relations__pb2
from pyspark.sql.connect.proto import expressions_pb2 as spark_dot_connect_dot_expressions__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(
    b'\n#spark/connect/example_plugins.proto\x12\rspark.connect\x1a\x1dspark/connect/relations.proto\x1a\x1fspark/connect/expressions.proto"i\n\x15\x45xamplePluginRelation\x12-\n\x05input\x18\x01 \x01(\x0b\x32\x17.spark.connect.RelationR\x05input\x12!\n\x0c\x63ustom_field\x18\x02 \x01(\tR\x0b\x63ustomField"m\n\x17\x45xamplePluginExpression\x12/\n\x05\x63hild\x18\x01 \x01(\x0b\x32\x19.spark.connect.ExpressionR\x05\x63hild\x12!\n\x0c\x63ustom_field\x18\x02 \x01(\tR\x0b\x63ustomField"9\n\x14\x45xamplePluginCommand\x12!\n\x0c\x63ustom_field\x18\x01 \x01(\tR\x0b\x63ustomFieldB6\n\x1eorg.apache.spark.connect.protoP\x01Z\x12internal/generatedb\x06proto3'
)


_EXAMPLEPLUGINRELATION = DESCRIPTOR.message_types_by_name["ExamplePluginRelation"]
_EXAMPLEPLUGINEXPRESSION = DESCRIPTOR.message_types_by_name["ExamplePluginExpression"]
_EXAMPLEPLUGINCOMMAND = DESCRIPTOR.message_types_by_name["ExamplePluginCommand"]
ExamplePluginRelation = _reflection.GeneratedProtocolMessageType(
    "ExamplePluginRelation",
    (_message.Message,),
    {
        "DESCRIPTOR": _EXAMPLEPLUGINRELATION,
        "__module__": "spark.connect.example_plugins_pb2"
        # @@protoc_insertion_point(class_scope:spark.connect.ExamplePluginRelation)
    },
)
_sym_db.RegisterMessage(ExamplePluginRelation)

ExamplePluginExpression = _reflection.GeneratedProtocolMessageType(
    "ExamplePluginExpression",
    (_message.Message,),
    {
        "DESCRIPTOR": _EXAMPLEPLUGINEXPRESSION,
        "__module__": "spark.connect.example_plugins_pb2"
        # @@protoc_insertion_point(class_scope:spark.connect.ExamplePluginExpression)
    },
)
_sym_db.RegisterMessage(ExamplePluginExpression)

ExamplePluginCommand = _reflection.GeneratedProtocolMessageType(
    "ExamplePluginCommand",
    (_message.Message,),
    {
        "DESCRIPTOR": _EXAMPLEPLUGINCOMMAND,
        "__module__": "spark.connect.example_plugins_pb2"
        # @@protoc_insertion_point(class_scope:spark.connect.ExamplePluginCommand)
    },
)
_sym_db.RegisterMessage(ExamplePluginCommand)

if _descriptor._USE_C_DESCRIPTORS == False:

    DESCRIPTOR._options = None
    DESCRIPTOR._serialized_options = (
        b"\n\036org.apache.spark.connect.protoP\001Z\022internal/generated"
    )
    _EXAMPLEPLUGINRELATION._serialized_start = 118
    _EXAMPLEPLUGINRELATION._serialized_end = 223
    _EXAMPLEPLUGINEXPRESSION._serialized_start = 225
    _EXAMPLEPLUGINEXPRESSION._serialized_end = 334
    _EXAMPLEPLUGINCOMMAND._serialized_start = 336
    _EXAMPLEPLUGINCOMMAND._serialized_end = 393
# @@protoc_insertion_point(module_scope)
