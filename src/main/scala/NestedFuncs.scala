/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object NestedFuncs:
  def outerF(p: Int): Int =
    val n = 3

    def innerF(v:Int): Int =
      val n = 9
      v + n

    p+innerF(7)

  @main def runNestFunc =
    println(outerF(10))
