public class e.b.a.y.y.k1 implements e.b.a.y.y.w0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<Data:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/y/w0<", */
	 /* "Ljava/lang/Integer;", */
	 /* "TData;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.b.a.y.y.w0 a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/y/w0<", */
/* "Landroid/net/Uri;", */
/* "TData;>;" */
/* } */
} // .end annotation
} // .end field
public final android.content.res.Resources b;
/* # direct methods */
public e.b.a.y.y.k1 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/res/Resources;", */
/* "Le/b/a/y/y/w0<", */
/* "Landroid/net/Uri;", */
/* "TData;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
/* .line 3 */
this.a = p2;
return;
} // .end method
/* # virtual methods */
public final android.net.Uri a ( java.lang.Integer p0 ) {
/* .locals 4 */
/* .line 5 */
try { // :try_start_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "android.resource://"; // const-string v1, "android.resource://"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
/* .line 6 */
v2 = (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
(( android.content.res.Resources ) v1 ).getResourcePackageName ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x2f */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
v2 = this.b;
/* .line 7 */
v3 = (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
(( android.content.res.Resources ) v2 ).getResourceTypeName ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
v1 = this.b;
/* .line 8 */
v2 = (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
(( android.content.res.Resources ) v1 ).getResourceEntryName ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 9 */
android.net.Uri .parse ( v0 );
/* :try_end_0 */
/* .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
int v1 = 5; // const/4 v1, 0x5
final String v2 = "ResourceLoader"; // const-string v2, "ResourceLoader"
/* .line 10 */
v1 = android.util.Log .isLoggable ( v2,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 11 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Received invalid resource id: "; // const-string v3, "Received invalid resource id: "
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v2,p1,v0 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public e.b.a.y.y.v0 a ( java.lang.Integer p0, Integer p1, Integer p2, Object p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Integer;", */
/* "II", */
/* "Le/b/a/y/r;", */
/* ")", */
/* "Le/b/a/y/y/v0<", */
/* "TData;>;" */
/* } */
} // .end annotation
/* .line 3 */
(( e.b.a.y.y.k1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/k1;->a(Ljava/lang/Integer;)Landroid/net/Uri;
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
} // :cond_0
v0 = this.a;
} // :goto_0
} // .end method
public e.b.a.y.y.v0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Ljava/lang/Integer; */
(( e.b.a.y.y.k1 ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/k1;->a(Ljava/lang/Integer;IILe/b/a/y/r;)Le/b/a/y/y/v0;
} // .end method
public Boolean a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
/* check-cast p1, Ljava/lang/Integer; */
p1 = (( e.b.a.y.y.k1 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/k1;->b(Ljava/lang/Integer;)Z
} // .end method
public Boolean b ( java.lang.Integer p0 ) {
/* .locals 0 */
int p1 = 1; // const/4 p1, 0x1
} // .end method
