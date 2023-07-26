public abstract class e.f.c.k.t {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.util.Set a ( java.util.Set p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/Set<", */
		 /* "Le/f/c/k/r;", */
		 /* ">;)", */
		 /* "Ljava/util/Set<", */
		 /* "Le/f/c/k/r;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .line 16 */
	 /* new-instance v0, Ljava/util/HashSet; */
	 /* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
	 /* .line 17 */
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Le/f/c/k/r; */
/* .line 18 */
v2 = (( e.f.c.k.r ) v1 ).d ( ); // invoke-virtual {v1}, Le/f/c/k/r;->d()Z
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 19 */
} // :cond_1
} // .end method
public static void a ( java.util.List p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/f/c/k/e<", */
/* "*>;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.k.t .b ( p0 );
/* .line 2 */
e.f.c.k.t .a ( v0 );
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
v3 = } // :cond_0
/* if-nez v3, :cond_2 */
/* .line 4 */
/* check-cast v3, Le/f/c/k/r; */
/* .line 5 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 6 */
(( e.f.c.k.r ) v3 ).b ( ); // invoke-virtual {v3}, Le/f/c/k/r;->b()Ljava/util/Set;
} // :cond_1
v5 = } // :goto_0
if ( v5 != null) { // if-eqz v5, :cond_0
/* check-cast v5, Le/f/c/k/r; */
/* .line 7 */
(( e.f.c.k.r ) v5 ).c ( v3 ); // invoke-virtual {v5, v3}, Le/f/c/k/r;->c(Le/f/c/k/r;)V
/* .line 8 */
v6 = (( e.f.c.k.r ) v5 ).d ( ); // invoke-virtual {v5}, Le/f/c/k/r;->d()Z
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 9 */
/* .line 10 */
p0 = } // :cond_2
/* if-ne v2, p0, :cond_3 */
return;
/* .line 11 */
} // :cond_3
/* new-instance p0, Ljava/util/ArrayList; */
/* invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V */
/* .line 12 */
} // :cond_4
v1 = } // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_5
/* check-cast v1, Le/f/c/k/r; */
/* .line 13 */
v2 = (( e.f.c.k.r ) v1 ).d ( ); // invoke-virtual {v1}, Le/f/c/k/r;->d()Z
/* if-nez v2, :cond_4 */
v2 = (( e.f.c.k.r ) v1 ).c ( ); // invoke-virtual {v1}, Le/f/c/k/r;->c()Z
/* if-nez v2, :cond_4 */
/* .line 14 */
(( e.f.c.k.r ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/k/r;->a()Le/f/c/k/e;
/* .line 15 */
} // :cond_5
/* new-instance v0, Lcom/google/firebase/components/DependencyCycleException; */
/* invoke-direct {v0, p0}, Lcom/google/firebase/components/DependencyCycleException;-><init>(Ljava/util/List;)V */
/* throw v0 */
} // .end method
public static java.util.Set b ( java.util.List p0 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/f/c/k/e<", */
/* "*>;>;)", */
/* "Ljava/util/Set<", */
/* "Le/f/c/k/r;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v1 = /* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V */
/* .line 2 */
v1 = } // :cond_0
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_4
/* check-cast v1, Le/f/c/k/e; */
/* .line 3 */
/* new-instance v3, Le/f/c/k/r; */
/* invoke-direct {v3, v1}, Le/f/c/k/r;-><init>(Le/f/c/k/e;)V */
/* .line 4 */
(( e.f.c.k.e ) v1 ).c ( ); // invoke-virtual {v1}, Le/f/c/k/e;->c()Ljava/util/Set;
v5 = } // :goto_0
if ( v5 != null) { // if-eqz v5, :cond_0
/* check-cast v5, Ljava/lang/Class; */
/* .line 5 */
/* new-instance v6, Le/f/c/k/s; */
v7 = (( e.f.c.k.e ) v1 ).g ( ); // invoke-virtual {v1}, Le/f/c/k/e;->g()Z
int v8 = 1; // const/4 v8, 0x1
/* xor-int/2addr v7, v8 */
/* invoke-direct {v6, v5, v7, v2}, Le/f/c/k/s;-><init>(Ljava/lang/Class;ZLe/f/c/k/q;)V */
v7 = /* .line 6 */
/* if-nez v7, :cond_1 */
/* .line 7 */
/* new-instance v7, Ljava/util/HashSet; */
/* invoke-direct {v7}, Ljava/util/HashSet;-><init>()V */
/* .line 8 */
} // :cond_1
/* check-cast v7, Ljava/util/Set; */
v9 = /* .line 9 */
/* if-nez v9, :cond_3 */
v6 = e.f.c.k.s .a ( v6 );
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 10 */
} // :cond_2
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* new-array v0, v8, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
/* aput-object v5, v0, v1 */
final String v1 = "Multiple components provide %s."; // const-string v1, "Multiple components provide %s."
/* .line 11 */
java.lang.String .format ( v1,v0 );
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 12 */
} // :cond_3
} // :goto_1
/* .line 13 */
} // :cond_4
v1 = } // :cond_5
if ( v1 != null) { // if-eqz v1, :cond_a
/* check-cast v1, Ljava/util/Set; */
/* .line 14 */
v3 = } // :cond_6
if ( v3 != null) { // if-eqz v3, :cond_5
/* check-cast v3, Le/f/c/k/r; */
/* .line 15 */
(( e.f.c.k.r ) v3 ).a ( ); // invoke-virtual {v3}, Le/f/c/k/r;->a()Le/f/c/k/e;
(( e.f.c.k.e ) v4 ).a ( ); // invoke-virtual {v4}, Le/f/c/k/e;->a()Ljava/util/Set;
} // :cond_7
v5 = } // :goto_2
if ( v5 != null) { // if-eqz v5, :cond_6
/* check-cast v5, Le/f/c/k/u; */
/* .line 16 */
v6 = (( e.f.c.k.u ) v5 ).b ( ); // invoke-virtual {v5}, Le/f/c/k/u;->b()Z
/* if-nez v6, :cond_8 */
/* .line 17 */
} // :cond_8
/* new-instance v6, Le/f/c/k/s; */
/* .line 18 */
(( e.f.c.k.u ) v5 ).a ( ); // invoke-virtual {v5}, Le/f/c/k/u;->a()Ljava/lang/Class;
v5 = (( e.f.c.k.u ) v5 ).d ( ); // invoke-virtual {v5}, Le/f/c/k/u;->d()Z
/* invoke-direct {v6, v7, v5, v2}, Le/f/c/k/s;-><init>(Ljava/lang/Class;ZLe/f/c/k/q;)V */
/* check-cast v5, Ljava/util/Set; */
/* if-nez v5, :cond_9 */
/* .line 19 */
} // :cond_9
v6 = } // :goto_3
if ( v6 != null) { // if-eqz v6, :cond_7
/* check-cast v6, Le/f/c/k/r; */
/* .line 20 */
(( e.f.c.k.r ) v3 ).a ( v6 ); // invoke-virtual {v3, v6}, Le/f/c/k/r;->a(Le/f/c/k/r;)V
/* .line 21 */
(( e.f.c.k.r ) v6 ).b ( v3 ); // invoke-virtual {v6, v3}, Le/f/c/k/r;->b(Le/f/c/k/r;)V
/* .line 22 */
} // :cond_a
/* new-instance p0, Ljava/util/HashSet; */
/* invoke-direct {p0}, Ljava/util/HashSet;-><init>()V */
/* .line 23 */
v1 = } // :goto_4
if ( v1 != null) { // if-eqz v1, :cond_b
/* check-cast v1, Ljava/util/Set; */
/* .line 24 */
(( java.util.HashSet ) p0 ).addAll ( v1 ); // invoke-virtual {p0, v1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z
} // :cond_b
} // .end method
