public class org.apache.log4j.lf5.util.ResourceUtils {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public org.apache.log4j.lf5.util.ResourceUtils ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.io.InputStream getResourceAsStream ( java.lang.Object p0, org.apache.log4j.lf5.util.Resource p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) p0 ).getClassLoader ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 2 */
			 (( org.apache.log4j.lf5.util.Resource ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/util/Resource;->getName()Ljava/lang/String;
			 (( java.lang.ClassLoader ) p0 ).getResourceAsStream ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
			 /* .line 3 */
		 } // :cond_0
		 (( org.apache.log4j.lf5.util.Resource ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/util/Resource;->getName()Ljava/lang/String;
		 java.lang.ClassLoader .getSystemResourceAsStream ( p0 );
	 } // :goto_0
} // .end method
public static java.net.URL getResourceAsURL ( java.lang.Object p0, org.apache.log4j.lf5.util.Resource p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 (( java.lang.Class ) p0 ).getClassLoader ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 /* .line 2 */
		 (( org.apache.log4j.lf5.util.Resource ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/util/Resource;->getName()Ljava/lang/String;
		 (( java.lang.ClassLoader ) p0 ).getResource ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;
		 /* .line 3 */
	 } // :cond_0
	 (( org.apache.log4j.lf5.util.Resource ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/util/Resource;->getName()Ljava/lang/String;
	 java.lang.ClassLoader .getSystemResource ( p0 );
} // :goto_0
} // .end method
