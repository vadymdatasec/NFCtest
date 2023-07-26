public class k.e1.i.e extends java.lang.ThreadLocal {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ThreadLocal<", */
	 /* "Ljava/text/DateFormat;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public k.e1.i.e ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public java.lang.Object initialValue ( ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .line 1 */
	 (( k.e1.i.e ) p0 ).initialValue ( ); // invoke-virtual {p0}, Lk/e1/i/e;->initialValue()Ljava/text/DateFormat;
} // .end method
public java.text.DateFormat initialValue ( ) {
	 /* .locals 3 */
	 /* .line 2 */
	 /* new-instance v0, Ljava/text/SimpleDateFormat; */
	 v1 = java.util.Locale.US;
	 final String v2 = "EEE, dd MMM yyyy HH:mm:ss \'GMT\'"; // const-string v2, "EEE, dd MMM yyyy HH:mm:ss \'GMT\'"
	 /* invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 3 */
	 (( java.text.DateFormat ) v0 ).setLenient ( v1 ); // invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setLenient(Z)V
	 /* .line 4 */
	 v1 = k.e1.e.n;
	 (( java.text.DateFormat ) v0 ).setTimeZone ( v1 ); // invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V
} // .end method
