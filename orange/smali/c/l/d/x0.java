public class c.l.d.x0 implements c.a.k.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Lc/a/k/c<", */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Boolean;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final c.l.d.o1 a; //synthetic
/* # direct methods */
public c.l.d.x0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.a = p1;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public void a ( java.lang.Object p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "SyntheticAccessor" */
	 /* } */
} // .end annotation
/* .line 1 */
/* check-cast p1, Ljava/util/Map; */
(( c.l.d.x0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/l/d/x0;->a(Ljava/util/Map;)V
return;
} // .end method
public void a ( java.util.Map p0 ) {
/* .locals 5 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "SyntheticAccessor" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Boolean;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 2 */
int v1 = 0; // const/4 v1, 0x0
/* new-array v2, v1, [Ljava/lang/String; */
/* check-cast v0, [Ljava/lang/String; */
/* .line 3 */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* .line 4 */
p1 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* new-array p1, p1, [I */
int v3 = 0; // const/4 v3, 0x0
/* .line 5 */
} // :goto_0
v4 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* if-ge v3, v4, :cond_1 */
/* .line 6 */
(( java.util.ArrayList ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Ljava/lang/Boolean; */
v4 = (( java.lang.Boolean ) v4 ).booleanValue ( ); // invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
if ( v4 != null) { // if-eqz v4, :cond_0
int v4 = 0; // const/4 v4, 0x0
} // :cond_0
int v4 = -1; // const/4 v4, -0x1
/* .line 7 */
} // :goto_1
/* aput v4, p1, v3 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 8 */
} // :cond_1
v1 = this.a;
v1 = this.C;
(( java.util.ArrayDeque ) v1 ).pollFirst ( ); // invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;
/* check-cast v1, Lc/l/d/j1; */
final String v2 = "FragmentManager"; // const-string v2, "FragmentManager"
/* if-nez v1, :cond_2 */
/* .line 9 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "No permissions were requested for "; // const-string v0, "No permissions were requested for "
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v2,p1 );
return;
/* .line 10 */
} // :cond_2
v3 = this.b;
/* .line 11 */
/* iget v1, v1, Lc/l/d/j1;->c:I */
/* .line 12 */
v4 = this.a;
c.l.d.o1 .c ( v4 );
(( c.l.d.c2 ) v4 ).d ( v3 ); // invoke-virtual {v4, v3}, Lc/l/d/c2;->d(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
/* if-nez v4, :cond_3 */
/* .line 13 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Permission request result delivered for unknown Fragment "; // const-string v0, "Permission request result delivered for unknown Fragment "
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v2,p1 );
return;
/* .line 14 */
} // :cond_3
(( androidx.fragment.app.Fragment ) v4 ).a ( v1, v0, p1 ); // invoke-virtual {v4, v1, v0, p1}, Landroidx/fragment/app/Fragment;->a(I[Ljava/lang/String;[I)V
return;
} // .end method
