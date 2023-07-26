public abstract class e.f.a.d.a.b.c {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.f.a.d.a.b.c ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static e.f.a.d.a.b.c a ( Long p0, java.util.Map p1 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(J", */
		 /* "Ljava/util/Map<", */
		 /* "Ljava/lang/String;", */
		 /* "Le/f/a/d/a/b/b;", */
		 /* ">;)", */
		 /* "Le/f/a/d/a/b/c;" */
		 /* } */
	 } // .end annotation
	 /* new-instance v0, Le/f/a/d/a/b/h0; */
	 /* invoke-direct {v0, p0, p1, p2}, Le/f/a/d/a/b/h0;-><init>(JLjava/util/Map;)V */
} // .end method
public static e.f.a.d.a.b.c a ( android.os.Bundle p0, e.f.a.d.a.b.x0 p1 ) {
	 /* .locals 1 */
	 /* new-instance v0, Ljava/util/ArrayList; */
	 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
	 e.f.a.d.a.b.c .a ( p0,p1,v0 );
} // .end method
public static e.f.a.d.a.b.c a ( android.os.Bundle p0, e.f.a.d.a.b.x0 p1, java.util.List p2 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Landroid/os/Bundle;", */
	 /* "Le/f/a/d/a/b/x0;", */
	 /* "Ljava/util/List<", */
	 /* "Ljava/lang/String;", */
	 /* ">;)", */
	 /* "Le/f/a/d/a/b/c;" */
	 /* } */
} // .end annotation
v0 = e.f.a.d.a.b.a0.a;
e.f.a.d.a.b.c .a ( p0,p1,p2,v0 );
} // .end method
public static e.f.a.d.a.b.c a ( android.os.Bundle p0, e.f.a.d.a.b.x0 p1, java.util.List p2, Object p3 ) {
/* .locals 12 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/os/Bundle;", */
/* "Le/f/a/d/a/b/x0;", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Le/f/a/d/a/b/y;", */
/* ")", */
/* "Le/f/a/d/a/b/c;" */
/* } */
} // .end annotation
final String v0 = "pack_names"; // const-string v0, "pack_names"
(( android.os.Bundle ) p0 ).getStringArrayList ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
/* new-instance v1, Ljava/util/HashMap; */
v2 = /* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_0 */
/* check-cast v4, Ljava/lang/String; */
e.f.a.d.a.b.b .a ( p0,v4,p1,p3 );
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_0
p2 = } // :goto_1
if ( p2 != null) { // if-eqz p2, :cond_1
/* check-cast p2, Ljava/lang/String; */
int v3 = 4; // const/4 v3, 0x4
int v4 = 0; // const/4 v4, 0x0
/* const-wide/16 v5, 0x0 */
/* const-wide/16 v7, 0x0 */
/* const-wide/16 v9, 0x0 */
int v11 = 1; // const/4 v11, 0x1
/* move-object v2, p2 */
/* invoke-static/range {v2 ..v11}, Le/f/a/d/a/b/b;->a(Ljava/lang/String;IIJJDI)Le/f/a/d/a/b/b; */
} // :cond_1
final String p1 = "total_bytes_to_download"; // const-string p1, "total_bytes_to_download"
(( android.os.Bundle ) p0 ).getLong ( p1 ); // invoke-virtual {p0, p1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
/* move-result-wide p0 */
e.f.a.d.a.b.c .a ( p0,p1,v1 );
} // .end method
/* # virtual methods */
public abstract java.util.Map a ( ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Le/f/a/d/a/b/b;", */
/* ">;" */
/* } */
} // .end annotation
} // .end method
public abstract Long b ( ) {
} // .end method
