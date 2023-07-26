public class org.apache.log4j.helpers.NullEnumeration implements java.util.Enumeration {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final org.apache.log4j.helpers.NullEnumeration a;
	 /* # direct methods */
	 public static org.apache.log4j.helpers.NullEnumeration ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/helpers/NullEnumeration; */
		 /* invoke-direct {v0}, Lorg/apache/log4j/helpers/NullEnumeration;-><init>()V */
		 return;
	 } // .end method
	 public org.apache.log4j.helpers.NullEnumeration ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.apache.log4j.helpers.NullEnumeration getInstance ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.helpers.NullEnumeration.a;
	 } // .end method
	 /* # virtual methods */
	 public Boolean hasMoreElements ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public java.lang.Object nextElement ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/util/NoSuchElementException; */
		 /* invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V */
		 /* throw v0 */
	 } // .end method
