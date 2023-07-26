public class c.h.k.k implements c.h.m.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Lc/h/m/a<", */
	 /* "Lc/h/k/l;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.String a; //synthetic
/* # direct methods */
public c.h.k.k ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.a = p1;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
	 /* .locals 4 */
	 /* .line 2 */
	 v0 = c.h.k.m.c;
	 /* monitor-enter v0 */
	 /* .line 3 */
	 try { // :try_start_0
		 v1 = c.h.k.m.d;
		 v2 = this.a;
		 (( c.e.i ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v1, Ljava/util/ArrayList; */
		 /* if-nez v1, :cond_0 */
		 /* .line 4 */
		 /* monitor-exit v0 */
		 return;
		 /* .line 5 */
	 } // :cond_0
	 v2 = c.h.k.m.d;
	 v3 = this.a;
	 (( c.e.i ) v2 ).remove ( v3 ); // invoke-virtual {v2, v3}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 6 */
	 /* monitor-exit v0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 7 */
} // :goto_0
v2 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-ge v0, v2, :cond_1 */
/* .line 8 */
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/h/m/a; */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
return;
/* :catchall_0 */
/* move-exception p1 */
/* .line 9 */
try { // :try_start_1
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
} // .end method
public void a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Lc/h/k/l; */
(( c.h.k.k ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/k/k;->a(Lc/h/k/l;)V
return;
} // .end method
