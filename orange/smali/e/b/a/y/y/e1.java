public class e.b.a.y.y.e1 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<Model:", */
	 /* "Ljava/lang/Object;", */
	 /* "Data:", */
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
/* "TModel;>;" */
/* } */
} // .end annotation
} // .end field
public final java.lang.Class b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class<", */
/* "TData;>;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.y.y.x0 c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/y/x0<", */
/* "+TModel;+TData;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.y.y.e1 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "TModel;>;", */
/* "Ljava/lang/Class<", */
/* "TData;>;", */
/* "Le/b/a/y/y/x0<", */
/* "+TModel;+TData;>;)V" */
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
public Boolean a ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)Z" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.a;
p1 = (( java.lang.Class ) v0 ).isAssignableFrom ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
} // .end method
public Boolean a ( java.lang.Class p0, java.lang.Class p1 ) {
/* .locals 0 */
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
p1 = (( e.b.a.y.y.e1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/e1;->a(Ljava/lang/Class;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.b;
p1 = (( java.lang.Class ) p1 ).isAssignableFrom ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
