public class org.apache.log4j.lf5.util.Resource {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.String a;
	 /* # direct methods */
	 public org.apache.log4j.lf5.util.Resource ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public org.apache.log4j.lf5.util.Resource ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 3 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.io.InputStream getInputStream ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 org.apache.log4j.lf5.util.ResourceUtils .getResourceAsStream ( p0,p0 );
	 } // .end method
	 public java.io.InputStreamReader getInputStreamReader ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 org.apache.log4j.lf5.util.ResourceUtils .getResourceAsStream ( p0,p0 );
		 /* if-nez v0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
	 } // :cond_0
	 /* new-instance v1, Ljava/io/InputStreamReader; */
	 /* invoke-direct {v1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
} // .end method
public java.lang.String getName ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.a;
} // .end method
public java.net.URL getURL ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 org.apache.log4j.lf5.util.ResourceUtils .getResourceAsURL ( p0,p0 );
} // .end method
public void setName ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.a = p1;
	 return;
} // .end method
