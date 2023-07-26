public abstract class e.f.a.b.b.v {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final Integer a;
public final e.f.a.b.h.h b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/a/b/h/h<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
public final Integer c;
public final android.os.Bundle d;
/* # direct methods */
public e.f.a.b.b.v ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Le/f/a/b/h/h; */
/* invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V */
this.b = v0;
/* .line 3 */
/* iput p1, p0, Le/f/a/b/b/v;->a:I */
/* .line 4 */
/* iput p2, p0, Le/f/a/b/b/v;->c:I */
/* .line 5 */
this.d = p3;
return;
} // .end method
/* # virtual methods */
public abstract void a ( android.os.Bundle p0 ) {
} // .end method
public final void a ( com.google.android.gms.cloudmessaging.zzp p0 ) {
/* .locals 5 */
final String v0 = "MessengerIpcClient"; // const-string v0, "MessengerIpcClient"
int v1 = 3; // const/4 v1, 0x3
/* .line 4 */
v1 = android.util.Log .isLoggable ( v0,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 5 */
java.lang.String .valueOf ( p0 );
java.lang.String .valueOf ( p1 );
java.lang.String .valueOf ( v1 );
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* add-int/lit8 v3, v3, 0xe */
java.lang.String .valueOf ( v2 );
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* add-int/2addr v3, v4 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v3 = "Failing "; // const-string v3, "Failing "
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " with "; // const-string v1, " with "
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 6 */
} // :cond_0
v0 = this.b;
(( e.f.a.b.h.h ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/b/h/h;->a(Ljava/lang/Exception;)V
return;
} // .end method
public final void a ( java.lang.Object p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)V" */
/* } */
} // .end annotation
final String v0 = "MessengerIpcClient"; // const-string v0, "MessengerIpcClient"
int v1 = 3; // const/4 v1, 0x3
/* .line 1 */
v1 = android.util.Log .isLoggable ( v0,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
java.lang.String .valueOf ( p0 );
java.lang.String .valueOf ( p1 );
java.lang.String .valueOf ( v1 );
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* add-int/lit8 v3, v3, 0x10 */
java.lang.String .valueOf ( v2 );
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* add-int/2addr v3, v4 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v3 = "Finishing "; // const-string v3, "Finishing "
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " with "; // const-string v1, " with "
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 3 */
} // :cond_0
v0 = this.b;
(( e.f.a.b.h.h ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/b/h/h;->a(Ljava/lang/Object;)V
return;
} // .end method
public abstract Boolean a ( ) {
} // .end method
public java.lang.String toString ( ) {
/* .locals 5 */
/* .line 1 */
/* iget v0, p0, Le/f/a/b/b/v;->c:I */
/* iget v1, p0, Le/f/a/b/b/v;->a:I */
v2 = (( e.f.a.b.b.v ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/b/v;->a()Z
/* new-instance v3, Ljava/lang/StringBuilder; */
/* const/16 v4, 0x37 */
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v4 = "Request { what="; // const-string v4, "Request { what="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v0 = " id="; // const-string v0, " id="
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v0 = " oneWay="; // const-string v0, " oneWay="
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v0 = "}"; // const-string v0, "}"
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
