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

import numpy as np

from pyspark.pandas.spark import functions as SF
from pyspark.pandas.utils import spark_column_equals
from pyspark.sql import functions as F
from pyspark.testing.pandasutils import PandasOnSparkTestCase


class SparkFunctionsTestsMixin:
    def test_repeat(self):
        # TODO: Placeholder
        pass


class SparkFunctionsTests(SparkFunctionsTestsMixin, PandasOnSparkTestCase):
    pass


if __name__ == "__main__":
    import unittest
    from pyspark.pandas.tests.test_spark_functions import *  # noqa: F401

    try:
        import xmlrunner

        testRunner = xmlrunner.XMLTestRunner(output="target/test-reports", verbosity=2)
    except ImportError:
        testRunner = None
    unittest.main(testRunner=testRunner, verbosity=2)
