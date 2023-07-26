public abstract class c.q.b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lc/q/b$a;, */
	 /* Lc/q/b$b; */
	 /* } */
} // .end annotation
/* # direct methods */
public static android.content.SharedPreferences a ( android.content.Context p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 c.q.b .b ( p0 );
	 /* .line 2 */
	 v1 = 	 c.q.b .g ( );
	 /* .line 3 */
	 (( android.content.Context ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
} // .end method
public static java.lang.String b ( android.content.Context p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String p0 = "_preferences"; // const-string p0, "_preferences"
	 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static Integer g ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public abstract android.content.SharedPreferences$Editor a ( ) {
} // .end method
public abstract void a ( androidx.preference.Preference p0 ) {
} // .end method
public abstract c.q.b$a b ( ) {
} // .end method
public abstract c.q.b$b c ( ) {
} // .end method
public abstract c.q.a d ( ) {
} // .end method
public abstract android.content.SharedPreferences e ( ) {
} // .end method
public abstract Boolean f ( ) {
} // .end method
