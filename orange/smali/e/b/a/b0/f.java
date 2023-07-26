public class e.b.a.b0.f {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* "R:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.Class a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
public final java.lang.Class b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class<", */
/* "TR;>;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.y.t c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/t<", */
/* "TT;TR;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.b0.f ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "TT;>;", */
/* "Ljava/lang/Class<", */
/* "TR;>;", */
/* "Le/b/a/y/t<", */
/* "TT;TR;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
this.b = p2;
/* .line 4 */
this.c = p3;
return;
} // .end method
/* # virtual methods */
public Boolean a ( java.lang.Class p0, java.lang.Class p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Class<", */
/* "*>;)Z" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
p1 = (( java.lang.Class ) v0 ).isAssignableFrom ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.b;
/* .line 2 */
p1 = (( java.lang.Class ) p2 ).isAssignableFrom ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
