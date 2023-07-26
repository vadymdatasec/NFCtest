public class c.n.a$a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lc/n/a; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public final java.util.Map a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Lc/n/g$a;", */
/* "Ljava/util/List<", */
/* "Lc/n/b;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
public final java.util.Map b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Lc/n/b;", */
/* "Lc/n/g$a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.n.a$a ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "Lc/n/b;", */
/* "Lc/n/g$a;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
/* .line 3 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.a = v0;
/* .line 4 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 5 */
/* check-cast v1, Lc/n/g$a; */
/* .line 6 */
v2 = this.a;
/* check-cast v2, Ljava/util/List; */
/* if-nez v2, :cond_0 */
/* .line 7 */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
/* .line 8 */
v3 = this.a;
/* .line 9 */
} // :cond_0
} // :cond_1
return;
} // .end method
public static void a ( java.util.List p0, Object p1, c.n.g$a p2, java.lang.Object p3 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lc/n/b;", */
/* ">;", */
/* "Lc/n/j;", */
/* "Lc/n/g$a;", */
/* "Ljava/lang/Object;", */
/* ")V" */
/* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
v0 = /* .line 3 */
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
/* .line 4 */
/* check-cast v1, Lc/n/b; */
(( c.n.b ) v1 ).a ( p1, p2, p3 ); // invoke-virtual {v1, p1, p2, p3}, Lc/n/b;->a(Lc/n/j;Lc/n/g$a;Ljava/lang/Object;)V
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public void a ( Object p0, c.n.g$a p1, java.lang.Object p2 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* check-cast v0, Ljava/util/List; */
c.n.a$a .a ( v0,p1,p2,p3 );
/* .line 2 */
v0 = this.a;
v1 = c.n.g$a.ON_ANY;
/* check-cast v0, Ljava/util/List; */
c.n.a$a .a ( v0,p1,p2,p3 );
return;
} // .end method
