public abstract class c.l.d.n2 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final a;
	 public static final c.l.d.x2 b;
	 public static final c.l.d.x2 c;
	 /* # direct methods */
	 public static c.l.d.n2 ( ) {
		 /* .locals 2 */
		 /* const/16 v0, 0xb */
		 /* new-array v0, v0, [I */
		 /* .line 1 */
		 /* fill-array-data v0, :array_0 */
		 /* .line 2 */
		 /* const/16 v1, 0x15 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 3 */
		 /* new-instance v0, Lc/l/d/t2; */
		 /* invoke-direct {v0}, Lc/l/d/t2;-><init>()V */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 4 */
} // :goto_0
/* .line 5 */
c.l.d.n2 .a ( );
return;
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x0 */
/* 0x3 */
/* 0x0 */
/* 0x1 */
/* 0x5 */
/* 0x4 */
/* 0x7 */
/* 0x6 */
/* 0x9 */
/* 0x8 */
/* 0xa */
} // .end array-data
} // .end method
public static android.view.View a ( Object p0, c.l.d.m2 p1, java.lang.Object p2, Boolean p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Lc/l/d/m2;", */
/* "Ljava/lang/Object;", */
/* "Z)", */
/* "Landroid/view/View;" */
/* } */
} // .end annotation
/* .line 140 */
p1 = this.c;
if ( p2 != null) { // if-eqz p2, :cond_1
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 141 */
p2 = this.m;
if ( p2 != null) { // if-eqz p2, :cond_1
	 /* .line 142 */
	 p2 = 	 (( java.util.ArrayList ) p2 ).isEmpty ( ); // invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z
	 /* if-nez p2, :cond_1 */
	 int p2 = 0; // const/4 p2, 0x0
	 if ( p3 != null) { // if-eqz p3, :cond_0
		 /* .line 143 */
		 p1 = this.m;
		 (( java.util.ArrayList ) p1 ).get ( p2 ); // invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast p1, Ljava/lang/String; */
		 /* .line 144 */
	 } // :cond_0
	 p1 = this.n;
	 (( java.util.ArrayList ) p1 ).get ( p2 ); // invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast p1, Ljava/lang/String; */
	 /* .line 145 */
} // :goto_0
(( c.e.i ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Landroid/view/View; */
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static c.e.b a ( Integer p0, java.util.ArrayList p1, java.util.ArrayList p2, Integer p3, Integer p4 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I", */
/* "Ljava/util/ArrayList<", */
/* "Lc/l/d/a;", */
/* ">;", */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/Boolean;", */
/* ">;II)", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 18 */
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
/* add-int/lit8 p4, p4, -0x1 */
} // :goto_0
/* if-lt p4, p3, :cond_4 */
/* .line 19 */
(( java.util.ArrayList ) p1 ).get ( p4 ); // invoke-virtual {p1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Lc/l/d/a; */
/* .line 20 */
v2 = (( c.l.d.a ) v1 ).b ( p0 ); // invoke-virtual {v1, p0}, Lc/l/d/a;->b(I)Z
/* if-nez v2, :cond_0 */
/* .line 21 */
} // :cond_0
(( java.util.ArrayList ) p2 ).get ( p4 ); // invoke-virtual {p2, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/Boolean; */
v2 = (( java.lang.Boolean ) v2 ).booleanValue ( ); // invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
/* .line 22 */
v3 = this.m;
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 23 */
v3 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 24 */
v2 = this.m;
/* .line 25 */
v1 = this.n;
/* .line 26 */
} // :cond_1
v2 = this.m;
/* .line 27 */
v1 = this.n;
/* move-object v8, v2 */
/* move-object v2, v1 */
/* move-object v1, v8 */
} // :goto_1
int v4 = 0; // const/4 v4, 0x0
} // :goto_2
/* if-ge v4, v3, :cond_3 */
/* .line 28 */
(( java.util.ArrayList ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Ljava/lang/String; */
/* .line 29 */
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v6, Ljava/lang/String; */
/* .line 30 */
(( c.e.i ) v0 ).remove ( v6 ); // invoke-virtual {v0, v6}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v7, Ljava/lang/String; */
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 31 */
(( c.e.i ) v0 ).put ( v5, v7 ); // invoke-virtual {v0, v5, v7}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 32 */
} // :cond_2
(( c.e.i ) v0 ).put ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :goto_3
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_3
} // :goto_4
/* add-int/lit8 p4, p4, -0x1 */
} // :cond_4
} // .end method
public static c.e.b a ( c.l.d.x2 p0, Object p1, java.lang.Object p2, c.l.d.m2 p3 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/x2;", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/lang/Object;", */
/* "Lc/l/d/m2;", */
/* ")", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 113 */
v0 = this.a;
/* .line 114 */
(( androidx.fragment.app.Fragment ) v0 ).M ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->M()Landroid/view/View;
/* .line 115 */
v2 = (( c.e.i ) p1 ).isEmpty ( ); // invoke-virtual {p1}, Lc/e/i;->isEmpty()Z
/* if-nez v2, :cond_7 */
if ( p2 != null) { // if-eqz p2, :cond_7
/* if-nez v1, :cond_0 */
/* .line 116 */
} // :cond_0
/* new-instance p2, Lc/e/b; */
/* invoke-direct {p2}, Lc/e/b;-><init>()V */
/* .line 117 */
(( c.l.d.x2 ) p0 ).a ( p2, v1 ); // invoke-virtual {p0, p2, v1}, Lc/l/d/x2;->a(Ljava/util/Map;Landroid/view/View;)V
/* .line 118 */
p0 = this.c;
/* .line 119 */
/* iget-boolean p3, p3, Lc/l/d/m2;->b:Z */
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 120 */
(( androidx.fragment.app.Fragment ) v0 ).s ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->s()Lc/h/e/i0;
/* .line 121 */
p0 = this.m;
/* .line 122 */
} // :cond_1
(( androidx.fragment.app.Fragment ) v0 ).p ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p()Lc/h/e/i0;
/* .line 123 */
p0 = this.n;
} // :goto_0
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 124 */
(( c.e.b ) p2 ).a ( p0 ); // invoke-virtual {p2, p0}, Lc/e/b;->a(Ljava/util/Collection;)Z
/* .line 125 */
(( c.e.b ) p1 ).values ( ); // invoke-virtual {p1}, Lc/e/b;->values()Ljava/util/Collection;
(( c.e.b ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Lc/e/b;->a(Ljava/util/Collection;)Z
} // :cond_2
if ( p3 != null) { // if-eqz p3, :cond_5
/* .line 126 */
(( c.h.e.i0 ) p3 ).a ( p0, p2 ); // invoke-virtual {p3, p0, p2}, Lc/h/e/i0;->a(Ljava/util/List;Ljava/util/Map;)V
/* .line 127 */
p3 = (( java.util.ArrayList ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 p3, p3, -0x1 */
} // :goto_1
/* if-ltz p3, :cond_6 */
/* .line 128 */
(( java.util.ArrayList ) p0 ).get ( p3 ); // invoke-virtual {p0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* .line 129 */
(( c.e.i ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/view/View; */
/* if-nez v1, :cond_3 */
/* .line 130 */
c.l.d.n2 .a ( p1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 131 */
(( c.e.i ) p1 ).remove ( v0 ); // invoke-virtual {p1, v0}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 132 */
} // :cond_3
c.h.n.v0 .v ( v1 );
v2 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_4 */
/* .line 133 */
c.l.d.n2 .a ( p1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 134 */
c.h.n.v0 .v ( v1 );
(( c.e.i ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_4
} // :goto_2
/* add-int/lit8 p3, p3, -0x1 */
/* .line 135 */
} // :cond_5
c.l.d.n2 .a ( p1,p2 );
} // :cond_6
/* .line 136 */
} // :cond_7
} // :goto_3
(( c.e.i ) p1 ).clear ( ); // invoke-virtual {p1}, Lc/e/i;->clear()V
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static c.l.d.m2 a ( c.l.d.m2 p0, android.util.SparseArray p1, Integer p2 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/m2;", */
/* "Landroid/util/SparseArray<", */
/* "Lc/l/d/m2;", */
/* ">;I)", */
/* "Lc/l/d/m2;" */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
/* .line 214 */
/* new-instance p0, Lc/l/d/m2; */
/* invoke-direct {p0}, Lc/l/d/m2;-><init>()V */
/* .line 215 */
(( android.util.SparseArray ) p1 ).put ( p2, p0 ); // invoke-virtual {p1, p2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
} // :cond_0
} // .end method
public static c.l.d.x2 a ( ) {
/* .locals 3 */
try { // :try_start_0
final String v0 = "c.v.w"; // const-string v0, "c.v.w"
/* .line 1 */
java.lang.Class .forName ( v0 );
int v1 = 0; // const/4 v1, 0x0
/* new-array v2, v1, [Ljava/lang/Class; */
/* .line 2 */
(( java.lang.Class ) v0 ).getDeclaredConstructor ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* new-array v1, v1, [Ljava/lang/Object; */
(( java.lang.reflect.Constructor ) v0 ).newInstance ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lc/l/d/x2; */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static c.l.d.x2 a ( androidx.fragment.app.Fragment p0, androidx.fragment.app.Fragment p1 ) {
/* .locals 2 */
/* .line 64 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 65 */
(( androidx.fragment.app.Fragment ) p0 ).r ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->r()Ljava/lang/Object;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 66 */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 67 */
} // :cond_0
(( androidx.fragment.app.Fragment ) p0 ).G ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Ljava/lang/Object;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 68 */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 69 */
} // :cond_1
(( androidx.fragment.app.Fragment ) p0 ).I ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->I()Ljava/lang/Object;
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 70 */
(( java.util.ArrayList ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_2
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 71 */
(( androidx.fragment.app.Fragment ) p1 ).o ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->o()Ljava/lang/Object;
if ( p0 != null) { // if-eqz p0, :cond_3
/* .line 72 */
(( java.util.ArrayList ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 73 */
} // :cond_3
(( androidx.fragment.app.Fragment ) p1 ).E ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->E()Ljava/lang/Object;
if ( p0 != null) { // if-eqz p0, :cond_4
/* .line 74 */
(( java.util.ArrayList ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 75 */
} // :cond_4
(( androidx.fragment.app.Fragment ) p1 ).H ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->H()Ljava/lang/Object;
if ( p0 != null) { // if-eqz p0, :cond_5
/* .line 76 */
(( java.util.ArrayList ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 77 */
} // :cond_5
p0 = (( java.util.ArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
int p1 = 0; // const/4 p1, 0x0
if ( p0 != null) { // if-eqz p0, :cond_6
/* .line 78 */
} // :cond_6
p0 = c.l.d.n2.b;
if ( p0 != null) { // if-eqz p0, :cond_7
p0 = c.l.d.n2 .a ( p0,v0 );
if ( p0 != null) { // if-eqz p0, :cond_7
/* .line 79 */
p0 = c.l.d.n2.b;
/* .line 80 */
} // :cond_7
p0 = c.l.d.n2.c;
if ( p0 != null) { // if-eqz p0, :cond_8
p0 = c.l.d.n2 .a ( p0,v0 );
if ( p0 != null) { // if-eqz p0, :cond_8
/* .line 81 */
p0 = c.l.d.n2.c;
/* .line 82 */
} // :cond_8
p0 = c.l.d.n2.b;
/* if-nez p0, :cond_9 */
p0 = c.l.d.n2.c;
/* if-nez p0, :cond_9 */
/* .line 83 */
} // :cond_9
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "Invalid Transition types"; // const-string p1, "Invalid Transition types"
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static java.lang.Object a ( c.l.d.x2 p0, android.view.ViewGroup p1, android.view.View p2, Object p3, c.l.d.m2 p4, java.util.ArrayList p5, java.util.ArrayList p6, java.lang.Object p7, java.lang.Object p8 ) {
/* .locals 17 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/x2;", */
/* "Landroid/view/ViewGroup;", */
/* "Landroid/view/View;", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Lc/l/d/m2;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Object;", */
/* ")", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* move-object/from16 v6, p0 */
/* move-object/from16 v7, p4 */
/* move-object/from16 v10, p5 */
/* move-object/from16 v11, p7 */
/* .line 97 */
v8 = this.a;
/* .line 98 */
v9 = this.d;
int v0 = 0; // const/4 v0, 0x0
if ( v8 != null) { // if-eqz v8, :cond_6
/* if-nez v9, :cond_0 */
/* goto/16 :goto_3 */
/* .line 99 */
} // :cond_0
/* iget-boolean v12, v7, Lc/l/d/m2;->b:Z */
/* .line 100 */
v1 = /* invoke-virtual/range {p3 ..p3}, Lc/e/i;->isEmpty()Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* move-object/from16 v13, p3 */
/* move-object v1, v0 */
/* .line 101 */
} // :cond_1
c.l.d.n2 .a ( v6,v8,v9,v12 );
/* move-object/from16 v13, p3 */
/* .line 102 */
} // :goto_0
c.l.d.n2 .b ( v6,v13,v1,v7 );
/* .line 103 */
v2 = /* invoke-virtual/range {p3 ..p3}, Lc/e/i;->isEmpty()Z */
if ( v2 != null) { // if-eqz v2, :cond_2
/* move-object v14, v0 */
/* .line 104 */
} // :cond_2
(( c.e.b ) v3 ).values ( ); // invoke-virtual {v3}, Lc/e/b;->values()Ljava/util/Collection;
(( java.util.ArrayList ) v10 ).addAll ( v2 ); // invoke-virtual {v10, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
/* move-object v14, v1 */
} // :goto_1
/* if-nez v11, :cond_3 */
/* if-nez p8, :cond_3 */
/* if-nez v14, :cond_3 */
} // :cond_3
int v1 = 1; // const/4 v1, 0x1
/* .line 105 */
c.l.d.n2 .a ( v8,v9,v12,v3,v1 );
if ( v14 != null) { // if-eqz v14, :cond_4
/* .line 106 */
/* new-instance v15, Landroid/graphics/Rect; */
/* invoke-direct {v15}, Landroid/graphics/Rect;-><init>()V */
/* move-object/from16 v5, p2 */
/* .line 107 */
(( c.l.d.x2 ) v6 ).b ( v14, v5, v10 ); // invoke-virtual {v6, v14, v5, v10}, Lc/l/d/x2;->b(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
/* .line 108 */
/* iget-boolean v4, v7, Lc/l/d/m2;->e:Z */
/* .line 109 */
v2 = this.f;
/* move-object/from16 v0, p0 */
/* move-object v1, v14 */
/* move-object/from16 v16, v2 */
/* move-object/from16 v2, p8 */
/* move-object/from16 v5, v16 */
/* .line 110 */
/* invoke-static/range {v0 ..v5}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/lang/Object;Ljava/lang/Object;Lc/e/b;ZLc/l/d/a;)V */
if ( v11 != null) { // if-eqz v11, :cond_5
/* .line 111 */
(( c.l.d.x2 ) v6 ).a ( v11, v15 ); // invoke-virtual {v6, v11, v15}, Lc/l/d/x2;->a(Ljava/lang/Object;Landroid/graphics/Rect;)V
} // :cond_4
/* move-object v15, v0 */
/* .line 112 */
} // :cond_5
} // :goto_2
/* new-instance v5, Lc/l/d/k2; */
/* move-object v0, v5 */
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p3 */
/* move-object v3, v14 */
/* move-object/from16 v4, p4 */
/* move-object v13, v5 */
/* move-object/from16 v5, p6 */
/* move-object/from16 v6, p2 */
/* move-object v7, v8 */
/* move-object v8, v9 */
/* move v9, v12 */
/* move-object/from16 v10, p5 */
/* move-object/from16 v11, p7 */
/* move-object v12, v15 */
/* invoke-direct/range {v0 ..v12}, Lc/l/d/k2;-><init>(Lc/l/d/x2;Lc/e/b;Ljava/lang/Object;Lc/l/d/m2;Ljava/util/ArrayList;Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLjava/util/ArrayList;Ljava/lang/Object;Landroid/graphics/Rect;)V */
/* move-object/from16 v0, p1 */
c.h.n.y .a ( v0,v13 );
} // :cond_6
} // :goto_3
} // .end method
public static java.lang.Object a ( c.l.d.x2 p0, androidx.fragment.app.Fragment p1, androidx.fragment.app.Fragment p2, Boolean p3 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_2
/* if-nez p2, :cond_0 */
} // :cond_0
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 86 */
(( androidx.fragment.app.Fragment ) p2 ).I ( ); // invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->I()Ljava/lang/Object;
/* .line 87 */
} // :cond_1
(( androidx.fragment.app.Fragment ) p1 ).H ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->H()Ljava/lang/Object;
/* .line 88 */
} // :goto_0
(( c.l.d.x2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/l/d/x2;->b(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 89 */
(( c.l.d.x2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/l/d/x2;->c(Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_2
} // :goto_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.lang.Object a ( c.l.d.x2 p0, androidx.fragment.app.Fragment p1, Boolean p2 ) {
/* .locals 0 */
/* if-nez p1, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 90 */
(( androidx.fragment.app.Fragment ) p1 ).E ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->E()Ljava/lang/Object;
/* .line 91 */
} // :cond_1
(( androidx.fragment.app.Fragment ) p1 ).o ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->o()Ljava/lang/Object;
/* .line 92 */
} // :goto_0
(( c.l.d.x2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/l/d/x2;->b(Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public static java.lang.Object a ( c.l.d.x2 p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, androidx.fragment.app.Fragment p4, Boolean p5 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_1
if ( p2 != null) { // if-eqz p2, :cond_1
if ( p4 != null) { // if-eqz p4, :cond_1
if ( p5 != null) { // if-eqz p5, :cond_0
/* .line 176 */
p4 = (( androidx.fragment.app.Fragment ) p4 ).i ( ); // invoke-virtual {p4}, Landroidx/fragment/app/Fragment;->i()Z
/* .line 177 */
} // :cond_0
p4 = (( androidx.fragment.app.Fragment ) p4 ).h ( ); // invoke-virtual {p4}, Landroidx/fragment/app/Fragment;->h()Z
} // :cond_1
int p4 = 1; // const/4 p4, 0x1
} // :goto_0
if ( p4 != null) { // if-eqz p4, :cond_2
/* .line 178 */
(( c.l.d.x2 ) p0 ).b ( p2, p1, p3 ); // invoke-virtual {p0, p2, p1, p3}, Lc/l/d/x2;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 179 */
} // :cond_2
(( c.l.d.x2 ) p0 ).a ( p2, p1, p3 ); // invoke-virtual {p0, p2, p1, p3}, Lc/l/d/x2;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :goto_1
} // .end method
public static java.lang.String a ( Object p0, java.lang.String p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* .line 137 */
v0 = (( c.e.i ) p0 ).size ( ); // invoke-virtual {p0}, Lc/e/i;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 138 */
(( c.e.i ) p0 ).e ( v1 ); // invoke-virtual {p0, v1}, Lc/e/i;->e(I)Ljava/lang/Object;
v2 = (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 139 */
(( c.e.i ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Lc/e/i;->c(I)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/String; */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.util.ArrayList a ( c.l.d.x2 p0, java.lang.Object p1, androidx.fragment.app.Fragment p2, java.util.ArrayList p3, android.view.View p4 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/x2;", */
/* "Ljava/lang/Object;", */
/* "Landroidx/fragment/app/Fragment;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Landroid/view/View;", */
/* ")", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 166 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 167 */
(( androidx.fragment.app.Fragment ) p2 ).M ( ); // invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->M()Landroid/view/View;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 168 */
(( c.l.d.x2 ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lc/l/d/x2;->a(Ljava/util/ArrayList;Landroid/view/View;)V
} // :cond_0
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 169 */
(( java.util.ArrayList ) v0 ).removeAll ( p3 ); // invoke-virtual {v0, p3}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z
/* .line 170 */
} // :cond_1
p2 = (( java.util.ArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
/* if-nez p2, :cond_3 */
/* .line 171 */
(( java.util.ArrayList ) v0 ).add ( p4 ); // invoke-virtual {v0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 172 */
(( c.l.d.x2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/l/d/x2;->a(Ljava/lang/Object;Ljava/util/ArrayList;)V
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :cond_3
} // :goto_0
} // .end method
public static void a ( android.content.Context p0, c.l.d.n0 p1, java.util.ArrayList p2, java.util.ArrayList p3, Integer p4, Integer p5, Boolean p6, c.l.d.l2 p7 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Lc/l/d/n0;", */
/* "Ljava/util/ArrayList<", */
/* "Lc/l/d/a;", */
/* ">;", */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/Boolean;", */
/* ">;IIZ", */
/* "Lc/l/d/l2;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 3 */
/* new-instance v0, Landroid/util/SparseArray; */
/* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
/* move v1, p4 */
} // :goto_0
/* if-ge v1, p5, :cond_1 */
/* .line 4 */
(( java.util.ArrayList ) p2 ).get ( v1 ); // invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/l/d/a; */
/* .line 5 */
(( java.util.ArrayList ) p3 ).get ( v1 ); // invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/Boolean; */
v3 = (( java.lang.Boolean ) v3 ).booleanValue ( ); // invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 6 */
c.l.d.n2 .b ( v2,v0,p6 );
/* .line 7 */
} // :cond_0
c.l.d.n2 .a ( v2,v0,p6 );
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 8 */
} // :cond_1
v1 = (( android.util.SparseArray ) v0 ).size ( ); // invoke-virtual {v0}, Landroid/util/SparseArray;->size()I
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 9 */
/* new-instance v1, Landroid/view/View; */
/* invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V */
/* .line 10 */
p0 = (( android.util.SparseArray ) v0 ).size ( ); // invoke-virtual {v0}, Landroid/util/SparseArray;->size()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_2
/* if-ge v2, p0, :cond_5 */
/* .line 11 */
v3 = (( android.util.SparseArray ) v0 ).keyAt ( v2 ); // invoke-virtual {v0, v2}, Landroid/util/SparseArray;->keyAt(I)I
/* .line 12 */
c.l.d.n2 .a ( v3,p2,p3,p4,p5 );
/* .line 13 */
(( android.util.SparseArray ) v0 ).valueAt ( v2 ); // invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;
/* check-cast v5, Lc/l/d/m2; */
/* .line 14 */
v6 = (( c.l.d.n0 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/l/d/n0;->a()Z
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 15 */
(( c.l.d.n0 ) p1 ).a ( v3 ); // invoke-virtual {p1, v3}, Lc/l/d/n0;->a(I)Landroid/view/View;
/* check-cast v3, Landroid/view/ViewGroup; */
/* if-nez v3, :cond_2 */
} // :cond_2
if ( p6 != null) { // if-eqz p6, :cond_3
/* .line 16 */
c.l.d.n2 .b ( v3,v5,v1,v4,p7 );
/* .line 17 */
} // :cond_3
c.l.d.n2 .a ( v3,v5,v1,v4,p7 );
} // :cond_4
} // :goto_3
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_5
return;
} // .end method
public static void a ( android.view.ViewGroup p0, c.l.d.m2 p1, android.view.View p2, Object p3, c.l.d.l2 p4 ) {
/* .locals 20 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/view/ViewGroup;", */
/* "Lc/l/d/m2;", */
/* "Landroid/view/View;", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Lc/l/d/l2;", */
/* ")V" */
/* } */
} // .end annotation
/* move-object/from16 v9, p0 */
/* move-object/from16 v10, p1 */
/* move-object/from16 v11, p2 */
/* move-object/from16 v12, p3 */
/* move-object/from16 v13, p4 */
/* .line 39 */
v14 = this.a;
/* .line 40 */
v15 = this.d;
/* .line 41 */
c.l.d.n2 .a ( v15,v14 );
/* if-nez v8, :cond_0 */
return;
/* .line 42 */
} // :cond_0
/* iget-boolean v0, v10, Lc/l/d/m2;->b:Z */
/* .line 43 */
/* iget-boolean v1, v10, Lc/l/d/m2;->e:Z */
/* .line 44 */
c.l.d.n2 .a ( v8,v14,v0 );
/* .line 45 */
c.l.d.n2 .b ( v8,v15,v1 );
/* .line 46 */
/* new-instance v5, Ljava/util/ArrayList; */
/* invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V */
/* .line 47 */
/* new-instance v4, Ljava/util/ArrayList; */
/* invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V */
/* move-object v0, v8 */
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p2 */
/* move-object/from16 v3, p3 */
/* move-object/from16 v16, v4 */
/* move-object/from16 v4, p1 */
/* move-object/from16 v17, v5 */
/* move-object/from16 v18, v6 */
/* move-object/from16 v6, v16 */
/* move-object/from16 v19, v7 */
/* move-object v9, v8 */
/* move-object/from16 v8, v18 */
/* .line 48 */
/* invoke-static/range {v0 ..v8}, Lc/l/d/n2;->a(Lc/l/d/x2;Landroid/view/ViewGroup;Landroid/view/View;Lc/e/b;Lc/l/d/m2;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
/* move-object/from16 v8, v19 */
/* if-nez v8, :cond_1 */
/* if-nez v6, :cond_1 */
/* move-object/from16 v0, v18 */
/* if-nez v0, :cond_2 */
return;
} // :cond_1
/* move-object/from16 v0, v18 */
} // :cond_2
/* move-object/from16 v7, v17 */
/* .line 49 */
c.l.d.n2 .a ( v9,v0,v15,v7,v11 );
if ( v17 != null) { // if-eqz v17, :cond_3
/* .line 50 */
v1 = /* invoke-virtual/range {v17 ..v17}, Ljava/util/ArrayList;->isEmpty()Z */
if ( v1 != null) { // if-eqz v1, :cond_4
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :cond_4
/* move-object/from16 v18, v0 */
/* .line 51 */
(( c.l.d.x2 ) v9 ).a ( v8, v11 ); // invoke-virtual {v9, v8, v11}, Lc/l/d/x2;->a(Ljava/lang/Object;Landroid/view/View;)V
/* .line 52 */
/* iget-boolean v5, v10, Lc/l/d/m2;->b:Z */
/* move-object v0, v9 */
/* move-object v1, v8 */
/* move-object/from16 v2, v18 */
/* move-object v3, v6 */
/* move-object v4, v14 */
/* invoke-static/range {v0 ..v5}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object; */
if ( v15 != null) { // if-eqz v15, :cond_6
if ( v17 != null) { // if-eqz v17, :cond_6
/* .line 53 */
v0 = /* invoke-virtual/range {v17 ..v17}, Ljava/util/ArrayList;->size()I */
/* if-gtz v0, :cond_5 */
v0 = (( java.util.ArrayList ) v7 ).size ( ); // invoke-virtual {v7}, Ljava/util/ArrayList;->size()I
/* if-lez v0, :cond_6 */
/* .line 54 */
} // :cond_5
/* new-instance v0, Lc/h/j/c; */
/* invoke-direct {v0}, Lc/h/j/c;-><init>()V */
/* .line 55 */
/* .line 56 */
/* new-instance v1, Lc/l/d/h2; */
/* invoke-direct {v1, v13, v15, v0}, Lc/l/d/h2;-><init>(Lc/l/d/l2;Landroidx/fragment/app/Fragment;Lc/h/j/c;)V */
(( c.l.d.x2 ) v9 ).a ( v15, v10, v0, v1 ); // invoke-virtual {v9, v15, v10, v0, v1}, Lc/l/d/x2;->a(Landroidx/fragment/app/Fragment;Ljava/lang/Object;Lc/h/j/c;Ljava/lang/Runnable;)V
} // :cond_6
if ( v10 != null) { // if-eqz v10, :cond_7
/* .line 57 */
/* new-instance v13, Ljava/util/ArrayList; */
/* invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V */
/* move-object v0, v9 */
/* move-object v1, v10 */
/* move-object v2, v8 */
/* move-object v3, v13 */
/* move-object/from16 v4, v18 */
/* move-object/from16 v5, v17 */
/* move-object/from16 v7, v16 */
/* .line 58 */
/* invoke-virtual/range {v0 ..v7}, Lc/l/d/x2;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V */
/* move-object/from16 v1, p0 */
/* move-object v2, v14 */
/* move-object/from16 v3, p2 */
/* move-object/from16 v4, v16 */
/* move-object v5, v8 */
/* move-object v6, v13 */
/* move-object/from16 v7, v18 */
/* move-object/from16 v8, v17 */
/* .line 59 */
/* invoke-static/range {v0 ..v8}, Lc/l/d/n2;->a(Lc/l/d/x2;Landroid/view/ViewGroup;Landroidx/fragment/app/Fragment;Landroid/view/View;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V */
/* move-object/from16 v0, p0 */
/* move-object v1, v9 */
/* move-object/from16 v2, v16 */
/* .line 60 */
(( c.l.d.x2 ) v1 ).a ( v0, v2, v12 ); // invoke-virtual {v1, v0, v2, v12}, Lc/l/d/x2;->a(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/Map;)V
/* .line 61 */
(( c.l.d.x2 ) v1 ).a ( v0, v10 ); // invoke-virtual {v1, v0, v10}, Lc/l/d/x2;->a(Landroid/view/ViewGroup;Ljava/lang/Object;)V
/* .line 62 */
(( c.l.d.x2 ) v1 ).a ( v0, v2, v12 ); // invoke-virtual {v1, v0, v2, v12}, Lc/l/d/x2;->a(Landroid/view/ViewGroup;Ljava/util/ArrayList;Ljava/util/Map;)V
} // :cond_7
return;
} // .end method
public static void a ( androidx.fragment.app.Fragment p0, androidx.fragment.app.Fragment p1, Boolean p2, Object p3, Boolean p4 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/fragment/app/Fragment;", */
/* "Landroidx/fragment/app/Fragment;", */
/* "Z", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Landroid/view/View;", */
/* ">;Z)V" */
/* } */
} // .end annotation
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 157 */
(( androidx.fragment.app.Fragment ) p1 ).p ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Lc/h/e/i0;
/* .line 158 */
} // :cond_0
(( androidx.fragment.app.Fragment ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Lc/h/e/i0;
} // :goto_0
if ( p0 != null) { // if-eqz p0, :cond_4
/* .line 159 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
/* .line 160 */
/* new-instance p2, Ljava/util/ArrayList; */
/* invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p3, :cond_1 */
int v1 = 0; // const/4 v1, 0x0
/* .line 161 */
} // :cond_1
v1 = (( c.e.i ) p3 ).size ( ); // invoke-virtual {p3}, Lc/e/i;->size()I
} // :goto_1
/* if-ge v0, v1, :cond_2 */
/* .line 162 */
(( c.e.i ) p3 ).c ( v0 ); // invoke-virtual {p3, v0}, Lc/e/i;->c(I)Ljava/lang/Object;
(( java.util.ArrayList ) p2 ).add ( v2 ); // invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 163 */
(( c.e.i ) p3 ).e ( v0 ); // invoke-virtual {p3, v0}, Lc/e/i;->e(I)Ljava/lang/Object;
(( java.util.ArrayList ) p1 ).add ( v2 ); // invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
int p3 = 0; // const/4 p3, 0x0
if ( p4 != null) { // if-eqz p4, :cond_3
/* .line 164 */
(( c.h.e.i0 ) p0 ).b ( p2, p1, p3 ); // invoke-virtual {p0, p2, p1, p3}, Lc/h/e/i0;->b(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
/* .line 165 */
} // :cond_3
(( c.h.e.i0 ) p0 ).a ( p2, p1, p3 ); // invoke-virtual {p0, p2, p1, p3}, Lc/h/e/i0;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
} // :cond_4
} // :goto_2
return;
} // .end method
public static void a ( Object p0, Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Landroid/view/View;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 153 */
v0 = (( c.e.i ) p0 ).size ( ); // invoke-virtual {p0}, Lc/e/i;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 154 */
(( c.e.i ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Lc/e/i;->e(I)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
/* .line 155 */
v1 = (( c.e.i ) p1 ).containsKey ( v1 ); // invoke-virtual {p1, v1}, Lc/e/i;->containsKey(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 156 */
(( c.e.i ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Lc/e/i;->d(I)Ljava/lang/Object;
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
return;
} // .end method
public static void a ( Object p0, android.util.SparseArray p1, Boolean p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/a;", */
/* "Landroid/util/SparseArray<", */
/* "Lc/l/d/m2;", */
/* ">;Z)V" */
/* } */
} // .end annotation
/* .line 180 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_0 */
/* .line 181 */
v3 = this.a;
(( java.util.ArrayList ) v3 ).get ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Lc/l/d/d2; */
/* .line 182 */
c.l.d.n2 .a ( p0,v3,p1,v1,p2 );
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
return;
} // .end method
public static void a ( Object p0, c.l.d.d2 p1, android.util.SparseArray p2, Boolean p3, Boolean p4 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/a;", */
/* "Lc/l/d/d2;", */
/* "Landroid/util/SparseArray<", */
/* "Lc/l/d/m2;", */
/* ">;ZZ)V" */
/* } */
} // .end annotation
/* .line 183 */
v0 = this.b;
/* if-nez v0, :cond_0 */
return;
/* .line 184 */
} // :cond_0
/* iget v1, v0, Landroidx/fragment/app/Fragment;->y:I */
/* if-nez v1, :cond_1 */
return;
} // :cond_1
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 185 */
v2 = c.l.d.n2.a;
/* iget p1, p1, Lc/l/d/d2;->a:I */
/* aget p1, v2, p1 */
} // :cond_2
/* iget p1, p1, Lc/l/d/d2;->a:I */
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* if-eq p1, v3, :cond_a */
int v4 = 3; // const/4 v4, 0x3
/* if-eq p1, v4, :cond_7 */
int v4 = 4; // const/4 v4, 0x4
/* if-eq p1, v4, :cond_5 */
int v4 = 5; // const/4 v4, 0x5
/* if-eq p1, v4, :cond_3 */
int v4 = 6; // const/4 v4, 0x6
/* if-eq p1, v4, :cond_7 */
int v4 = 7; // const/4 v4, 0x7
/* if-eq p1, v4, :cond_a */
int p1 = 0; // const/4 p1, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
int v4 = 0; // const/4 v4, 0x0
/* goto/16 :goto_7 */
} // :cond_3
if ( p4 != null) { // if-eqz p4, :cond_4
/* .line 186 */
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->N:Z */
if ( p1 != null) { // if-eqz p1, :cond_c
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->A:Z */
/* if-nez p1, :cond_c */
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->m:Z */
if ( p1 != null) { // if-eqz p1, :cond_c
/* .line 187 */
} // :cond_4
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->A:Z */
} // :cond_5
if ( p4 != null) { // if-eqz p4, :cond_6
/* .line 188 */
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->N:Z */
if ( p1 != null) { // if-eqz p1, :cond_8
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->m:Z */
if ( p1 != null) { // if-eqz p1, :cond_8
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->A:Z */
if ( p1 != null) { // if-eqz p1, :cond_8
} // :goto_2
/* .line 189 */
} // :cond_6
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->m:Z */
if ( p1 != null) { // if-eqz p1, :cond_8
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->A:Z */
/* if-nez p1, :cond_8 */
} // :cond_7
if ( p4 != null) { // if-eqz p4, :cond_9
/* .line 190 */
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->m:Z */
/* if-nez p1, :cond_8 */
p1 = this.I;
if ( p1 != null) { // if-eqz p1, :cond_8
/* .line 191 */
p1 = (( android.view.View ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
/* if-nez p1, :cond_8 */
/* iget p1, v0, Landroidx/fragment/app/Fragment;->O:F */
int v4 = 0; // const/4 v4, 0x0
/* cmpl-float p1, p1, v4 */
/* if-ltz p1, :cond_8 */
} // :goto_3
int p1 = 1; // const/4 p1, 0x1
} // :cond_8
int p1 = 0; // const/4 p1, 0x0
/* .line 192 */
} // :cond_9
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->m:Z */
if ( p1 != null) { // if-eqz p1, :cond_8
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->A:Z */
/* if-nez p1, :cond_8 */
} // :goto_4
/* move v4, p1 */
int p1 = 1; // const/4 p1, 0x1
int v3 = 0; // const/4 v3, 0x0
} // :cond_a
if ( p4 != null) { // if-eqz p4, :cond_b
/* .line 193 */
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->M:Z */
/* .line 194 */
} // :cond_b
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->m:Z */
/* if-nez p1, :cond_c */
/* iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->A:Z */
/* if-nez p1, :cond_c */
} // :goto_5
int p1 = 1; // const/4 p1, 0x1
} // :cond_c
int p1 = 0; // const/4 p1, 0x0
} // :goto_6
/* move v2, p1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 195 */
} // :goto_7
(( android.util.SparseArray ) p2 ).get ( v1 ); // invoke-virtual {p2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v5, Lc/l/d/m2; */
if ( v2 != null) { // if-eqz v2, :cond_d
/* .line 196 */
c.l.d.n2 .a ( v5,p2,v1 );
/* .line 197 */
this.a = v0;
/* .line 198 */
/* iput-boolean p3, v5, Lc/l/d/m2;->b:Z */
/* .line 199 */
this.c = p0;
} // :cond_d
int v2 = 0; // const/4 v2, 0x0
/* if-nez p4, :cond_f */
if ( v3 != null) { // if-eqz v3, :cond_f
if ( v5 != null) { // if-eqz v5, :cond_e
/* .line 200 */
v3 = this.d;
/* if-ne v3, v0, :cond_e */
/* .line 201 */
this.d = v2;
/* .line 202 */
} // :cond_e
/* iget-boolean v3, p0, Lc/l/d/e2;->o:Z */
/* if-nez v3, :cond_f */
/* .line 203 */
v3 = this.q;
/* .line 204 */
(( c.l.d.o1 ) v3 ).e ( v0 ); // invoke-virtual {v3, v0}, Lc/l/d/o1;->e(Landroidx/fragment/app/Fragment;)Lc/l/d/a2;
/* .line 205 */
(( c.l.d.o1 ) v3 ).y ( ); // invoke-virtual {v3}, Lc/l/d/o1;->y()Lc/l/d/c2;
(( c.l.d.c2 ) v7 ).a ( v6 ); // invoke-virtual {v7, v6}, Lc/l/d/c2;->a(Lc/l/d/a2;)V
/* .line 206 */
(( c.l.d.o1 ) v3 ).s ( v0 ); // invoke-virtual {v3, v0}, Lc/l/d/o1;->s(Landroidx/fragment/app/Fragment;)V
} // :cond_f
if ( v4 != null) { // if-eqz v4, :cond_11
if ( v5 != null) { // if-eqz v5, :cond_10
/* .line 207 */
v3 = this.d;
/* if-nez v3, :cond_11 */
/* .line 208 */
} // :cond_10
c.l.d.n2 .a ( v5,p2,v1 );
/* .line 209 */
this.d = v0;
/* .line 210 */
/* iput-boolean p3, v5, Lc/l/d/m2;->e:Z */
/* .line 211 */
this.f = p0;
} // :cond_11
/* if-nez p4, :cond_12 */
if ( p1 != null) { // if-eqz p1, :cond_12
if ( v5 != null) { // if-eqz v5, :cond_12
/* .line 212 */
p0 = this.a;
/* if-ne p0, v0, :cond_12 */
/* .line 213 */
this.a = v2;
} // :cond_12
return;
} // .end method
public static void a ( c.l.d.x2 p0, android.view.ViewGroup p1, androidx.fragment.app.Fragment p2, android.view.View p3, java.util.ArrayList p4, java.lang.Object p5, java.util.ArrayList p6, java.lang.Object p7, java.util.ArrayList p8 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/x2;", */
/* "Landroid/view/ViewGroup;", */
/* "Landroidx/fragment/app/Fragment;", */
/* "Landroid/view/View;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Ljava/lang/Object;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Ljava/lang/Object;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 63 */
/* new-instance v9, Lc/l/d/i2; */
/* move-object v0, v9 */
/* move-object v1, p5 */
/* move-object v2, p0 */
/* move-object v3, p3 */
/* move-object v4, p2 */
/* move-object v5, p4 */
/* move-object/from16 v6, p6 */
/* move-object/from16 v7, p8 */
/* move-object/from16 v8, p7 */
/* invoke-direct/range {v0 ..v8}, Lc/l/d/i2;-><init>(Ljava/lang/Object;Lc/l/d/x2;Landroid/view/View;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;)V */
/* move-object v0, p1 */
c.h.n.y .a ( p1,v9 );
return;
} // .end method
public static void a ( c.l.d.x2 p0, java.lang.Object p1, androidx.fragment.app.Fragment p2, java.util.ArrayList p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/x2;", */
/* "Ljava/lang/Object;", */
/* "Landroidx/fragment/app/Fragment;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;)V" */
/* } */
} // .end annotation
if ( p2 != null) { // if-eqz p2, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 33 */
/* iget-boolean v0, p2, Landroidx/fragment/app/Fragment;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p2, Landroidx/fragment/app/Fragment;->A:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p2, Landroidx/fragment/app/Fragment;->N:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 34 */
(( androidx.fragment.app.Fragment ) p2 ).h ( v0 ); // invoke-virtual {p2, v0}, Landroidx/fragment/app/Fragment;->h(Z)V
/* .line 35 */
(( androidx.fragment.app.Fragment ) p2 ).M ( ); // invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->M()Landroid/view/View;
/* .line 36 */
(( c.l.d.x2 ) p0 ).a ( p1, v0, p3 ); // invoke-virtual {p0, p1, v0, p3}, Lc/l/d/x2;->a(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
/* .line 37 */
p0 = this.H;
/* .line 38 */
/* new-instance p1, Lc/l/d/g2; */
/* invoke-direct {p1, p3}, Lc/l/d/g2;-><init>(Ljava/util/ArrayList;)V */
c.h.n.y .a ( p0,p1 );
} // :cond_0
return;
} // .end method
public static void a ( c.l.d.x2 p0, java.lang.Object p1, java.lang.Object p2, Object p3, Boolean p4, Object p5 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/x2;", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Object;", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Landroid/view/View;", */
/* ">;Z", */
/* "Lc/l/d/a;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 146 */
v0 = this.m;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 147 */
v0 = (( java.util.ArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
if ( p4 != null) { // if-eqz p4, :cond_0
/* .line 148 */
p4 = this.n;
(( java.util.ArrayList ) p4 ).get ( v0 ); // invoke-virtual {p4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p4, Ljava/lang/String; */
/* .line 149 */
} // :cond_0
p4 = this.m;
(( java.util.ArrayList ) p4 ).get ( v0 ); // invoke-virtual {p4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p4, Ljava/lang/String; */
/* .line 150 */
} // :goto_0
(( c.e.i ) p3 ).get ( p4 ); // invoke-virtual {p3, p4}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p3, Landroid/view/View; */
/* .line 151 */
(( c.l.d.x2 ) p0 ).c ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Lc/l/d/x2;->c(Ljava/lang/Object;Landroid/view/View;)V
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 152 */
(( c.l.d.x2 ) p0 ).c ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lc/l/d/x2;->c(Ljava/lang/Object;Landroid/view/View;)V
} // :cond_1
return;
} // .end method
public static void a ( java.util.ArrayList p0, Integer p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;I)V" */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
return;
/* .line 173 */
} // :cond_0
v0 = (( java.util.ArrayList ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 174 */
(( java.util.ArrayList ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/view/View; */
/* .line 175 */
(( android.view.View ) v1 ).setVisibility ( p1 ); // invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
return;
} // .end method
public static void a ( java.util.ArrayList p0, Object p1, java.util.Collection p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Ljava/util/Collection<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 93 */
v0 = (( c.e.i ) p1 ).size ( ); // invoke-virtual {p1}, Lc/e/i;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 94 */
(( c.e.i ) p1 ).e ( v0 ); // invoke-virtual {p1, v0}, Lc/e/i;->e(I)Ljava/lang/Object;
/* check-cast v1, Landroid/view/View; */
/* .line 95 */
v2 = c.h.n.v0 .v ( v1 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 96 */
(( java.util.ArrayList ) p0 ).add ( v1 ); // invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
return;
} // .end method
public static Boolean a ( c.l.d.x2 p0, java.util.List p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/x2;", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Object;", */
/* ">;)Z" */
/* } */
} // .end annotation
v0 = /* .line 84 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* .line 85 */
v3 = (( c.l.d.x2 ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Lc/l/d/x2;->a(Ljava/lang/Object;)Z
/* if-nez v3, :cond_0 */
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static c.e.b b ( c.l.d.x2 p0, Object p1, java.lang.Object p2, c.l.d.m2 p3 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/x2;", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/lang/Object;", */
/* "Lc/l/d/m2;", */
/* ")", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 54 */
v0 = (( c.e.i ) p1 ).isEmpty ( ); // invoke-virtual {p1}, Lc/e/i;->isEmpty()Z
/* if-nez v0, :cond_7 */
/* if-nez p2, :cond_0 */
/* .line 55 */
} // :cond_0
p2 = this.d;
/* .line 56 */
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
/* .line 57 */
(( androidx.fragment.app.Fragment ) p2 ).w0 ( ); // invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->w0()Landroid/view/View;
(( c.l.d.x2 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/l/d/x2;->a(Ljava/util/Map;Landroid/view/View;)V
/* .line 58 */
p0 = this.f;
/* .line 59 */
/* iget-boolean p3, p3, Lc/l/d/m2;->e:Z */
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 60 */
(( androidx.fragment.app.Fragment ) p2 ).p ( ); // invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->p()Lc/h/e/i0;
/* .line 61 */
p0 = this.n;
/* .line 62 */
} // :cond_1
(( androidx.fragment.app.Fragment ) p2 ).s ( ); // invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->s()Lc/h/e/i0;
/* .line 63 */
p0 = this.m;
} // :goto_0
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 64 */
(( c.e.b ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/e/b;->a(Ljava/util/Collection;)Z
} // :cond_2
if ( p2 != null) { // if-eqz p2, :cond_5
/* .line 65 */
(( c.h.e.i0 ) p2 ).a ( p0, v0 ); // invoke-virtual {p2, p0, v0}, Lc/h/e/i0;->a(Ljava/util/List;Ljava/util/Map;)V
/* .line 66 */
p2 = (( java.util.ArrayList ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 p2, p2, -0x1 */
} // :goto_1
/* if-ltz p2, :cond_6 */
/* .line 67 */
(( java.util.ArrayList ) p0 ).get ( p2 ); // invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p3, Ljava/lang/String; */
/* .line 68 */
(( c.e.i ) v0 ).get ( p3 ); // invoke-virtual {v0, p3}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/view/View; */
/* if-nez v1, :cond_3 */
/* .line 69 */
(( c.e.i ) p1 ).remove ( p3 ); // invoke-virtual {p1, p3}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 70 */
} // :cond_3
c.h.n.v0 .v ( v1 );
v2 = (( java.lang.String ) p3 ).equals ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_4 */
/* .line 71 */
(( c.e.i ) p1 ).remove ( p3 ); // invoke-virtual {p1, p3}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p3, Ljava/lang/String; */
/* .line 72 */
c.h.n.v0 .v ( v1 );
(( c.e.i ) p1 ).put ( v1, p3 ); // invoke-virtual {p1, v1, p3}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_4
} // :goto_2
/* add-int/lit8 p2, p2, -0x1 */
/* .line 73 */
} // :cond_5
(( c.e.b ) v0 ).keySet ( ); // invoke-virtual {v0}, Lc/e/b;->keySet()Ljava/util/Set;
(( c.e.b ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lc/e/b;->a(Ljava/util/Collection;)Z
} // :cond_6
/* .line 74 */
} // :cond_7
} // :goto_3
(( c.e.i ) p1 ).clear ( ); // invoke-virtual {p1}, Lc/e/i;->clear()V
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.lang.Object b ( c.l.d.x2 p0, android.view.ViewGroup p1, android.view.View p2, Object p3, c.l.d.m2 p4, java.util.ArrayList p5, java.util.ArrayList p6, java.lang.Object p7, java.lang.Object p8 ) {
/* .locals 15 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/x2;", */
/* "Landroid/view/ViewGroup;", */
/* "Landroid/view/View;", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Lc/l/d/m2;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Object;", */
/* ")", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* move-object v6, p0 */
/* move-object/from16 v0, p2 */
/* move-object/from16 v1, p3 */
/* move-object/from16 v7, p4 */
/* move-object/from16 v2, p5 */
/* move-object/from16 v3, p6 */
/* move-object/from16 v8, p7 */
/* .line 29 */
v9 = this.a;
/* .line 30 */
v10 = this.d;
if ( v9 != null) { // if-eqz v9, :cond_0
/* .line 31 */
(( androidx.fragment.app.Fragment ) v9 ).w0 ( ); // invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->w0()Landroid/view/View;
int v5 = 0; // const/4 v5, 0x0
(( android.view.View ) v4 ).setVisibility ( v5 ); // invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
if ( v9 != null) { // if-eqz v9, :cond_9
/* if-nez v10, :cond_1 */
/* goto/16 :goto_3 */
/* .line 32 */
} // :cond_1
/* iget-boolean v11, v7, Lc/l/d/m2;->b:Z */
/* .line 33 */
v5 = /* invoke-virtual/range {p3 ..p3}, Lc/e/i;->isEmpty()Z */
if ( v5 != null) { // if-eqz v5, :cond_2
/* move-object v5, v4 */
/* .line 34 */
} // :cond_2
c.l.d.n2 .a ( p0,v9,v10,v11 );
/* .line 35 */
} // :goto_0
c.l.d.n2 .b ( p0,v1,v5,v7 );
/* .line 36 */
c.l.d.n2 .a ( p0,v1,v5,v7 );
/* .line 37 */
v14 = /* invoke-virtual/range {p3 ..p3}, Lc/e/i;->isEmpty()Z */
if ( v14 != null) { // if-eqz v14, :cond_5
if ( v12 != null) { // if-eqz v12, :cond_3
/* .line 38 */
(( c.e.i ) v12 ).clear ( ); // invoke-virtual {v12}, Lc/e/i;->clear()V
} // :cond_3
if ( v13 != null) { // if-eqz v13, :cond_4
/* .line 39 */
(( c.e.i ) v13 ).clear ( ); // invoke-virtual {v13}, Lc/e/i;->clear()V
} // :cond_4
/* move-object v14, v4 */
/* .line 40 */
} // :cond_5
/* invoke-virtual/range {p3 ..p3}, Lc/e/b;->keySet()Ljava/util/Set; */
/* .line 41 */
c.l.d.n2 .a ( v2,v12,v14 );
/* .line 42 */
/* invoke-virtual/range {p3 ..p3}, Lc/e/b;->values()Ljava/util/Collection; */
/* .line 43 */
c.l.d.n2 .a ( v3,v13,v1 );
/* move-object v14, v5 */
} // :goto_1
/* if-nez v8, :cond_6 */
/* if-nez p8, :cond_6 */
/* if-nez v14, :cond_6 */
} // :cond_6
int v1 = 1; // const/4 v1, 0x1
/* .line 44 */
c.l.d.n2 .a ( v9,v10,v11,v12,v1 );
if ( v14 != null) { // if-eqz v14, :cond_8
/* .line 45 */
(( java.util.ArrayList ) v3 ).add ( v0 ); // invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 46 */
(( c.l.d.x2 ) p0 ).b ( v14, v0, v2 ); // invoke-virtual {p0, v14, v0, v2}, Lc/l/d/x2;->b(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
/* .line 47 */
/* iget-boolean v4, v7, Lc/l/d/m2;->e:Z */
/* .line 48 */
v5 = this.f;
/* move-object v0, p0 */
/* move-object v1, v14 */
/* move-object/from16 v2, p8 */
/* move-object v3, v12 */
/* .line 49 */
/* invoke-static/range {v0 ..v5}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/lang/Object;Ljava/lang/Object;Lc/e/b;ZLc/l/d/a;)V */
/* .line 50 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
/* .line 51 */
c.l.d.n2 .a ( v13,v7,v8,v11 );
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 52 */
(( c.l.d.x2 ) p0 ).a ( v8, v0 ); // invoke-virtual {p0, v8, v0}, Lc/l/d/x2;->a(Ljava/lang/Object;Landroid/graphics/Rect;)V
} // :cond_7
/* move-object v7, v0 */
/* move-object v5, v1 */
} // :cond_8
/* move-object v5, v4 */
/* move-object v7, v5 */
/* .line 53 */
} // :goto_2
/* new-instance v8, Lc/l/d/j2; */
/* move-object v0, v8 */
/* move-object v1, v9 */
/* move-object v2, v10 */
/* move v3, v11 */
/* move-object v4, v13 */
/* move-object v6, p0 */
/* invoke-direct/range {v0 ..v7}, Lc/l/d/j2;-><init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLc/e/b;Landroid/view/View;Lc/l/d/x2;Landroid/graphics/Rect;)V */
/* move-object/from16 v0, p1 */
c.h.n.y .a ( v0,v8 );
} // :cond_9
} // :goto_3
} // .end method
public static java.lang.Object b ( c.l.d.x2 p0, androidx.fragment.app.Fragment p1, Boolean p2 ) {
/* .locals 0 */
/* if-nez p1, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 26 */
(( androidx.fragment.app.Fragment ) p1 ).G ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->G()Ljava/lang/Object;
/* .line 27 */
} // :cond_1
(( androidx.fragment.app.Fragment ) p1 ).r ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->r()Ljava/lang/Object;
/* .line 28 */
} // :goto_0
(( c.l.d.x2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/l/d/x2;->b(Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public static void b ( android.view.ViewGroup p0, c.l.d.m2 p1, android.view.View p2, Object p3, c.l.d.l2 p4 ) {
/* .locals 17 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/view/ViewGroup;", */
/* "Lc/l/d/m2;", */
/* "Landroid/view/View;", */
/* "Lc/e/b<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Lc/l/d/l2;", */
/* ")V" */
/* } */
} // .end annotation
/* move-object/from16 v4, p1 */
/* move-object/from16 v9, p2 */
/* move-object/from16 v10, p4 */
/* .line 1 */
v11 = this.a;
/* .line 2 */
v12 = this.d;
/* .line 3 */
c.l.d.n2 .a ( v12,v11 );
/* if-nez v13, :cond_0 */
return;
/* .line 4 */
} // :cond_0
/* iget-boolean v14, v4, Lc/l/d/m2;->b:Z */
/* .line 5 */
/* iget-boolean v0, v4, Lc/l/d/m2;->e:Z */
/* .line 6 */
/* new-instance v15, Ljava/util/ArrayList; */
/* invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V */
/* .line 7 */
/* new-instance v8, Ljava/util/ArrayList; */
/* invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V */
/* .line 8 */
c.l.d.n2 .a ( v13,v11,v14 );
/* .line 9 */
c.l.d.n2 .b ( v13,v12,v0 );
/* move-object v0, v13 */
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p2 */
/* move-object/from16 v3, p3 */
/* move-object/from16 v4, p1 */
/* move-object v5, v8 */
/* move-object/from16 p1, v6 */
/* move-object v6, v15 */
/* move-object/from16 v16, v7 */
/* move-object v10, v8 */
/* move-object/from16 v8, p1 */
/* .line 10 */
/* invoke-static/range {v0 ..v8}, Lc/l/d/n2;->b(Lc/l/d/x2;Landroid/view/ViewGroup;Landroid/view/View;Lc/e/b;Lc/l/d/m2;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
/* move-object/from16 v6, v16 */
/* if-nez v6, :cond_1 */
/* if-nez v8, :cond_1 */
/* move-object/from16 v7, p1 */
/* if-nez v7, :cond_2 */
return;
} // :cond_1
/* move-object/from16 v7, p1 */
/* .line 11 */
} // :cond_2
c.l.d.n2 .a ( v13,v7,v12,v10,v9 );
/* .line 12 */
c.l.d.n2 .a ( v13,v6,v11,v15,v9 );
int v0 = 4; // const/4 v0, 0x4
/* .line 13 */
c.l.d.n2 .a ( v9,v0 );
/* move-object v0, v13 */
/* move-object v1, v6 */
/* move-object v2, v7 */
/* move-object v3, v8 */
/* move-object v4, v11 */
/* move-object v11, v5 */
/* move v5, v14 */
/* .line 14 */
/* invoke-static/range {v0 ..v5}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object; */
if ( v12 != null) { // if-eqz v12, :cond_4
if ( v11 != null) { // if-eqz v11, :cond_4
/* .line 15 */
v0 = (( java.util.ArrayList ) v11 ).size ( ); // invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
/* if-gtz v0, :cond_3 */
v0 = (( java.util.ArrayList ) v10 ).size ( ); // invoke-virtual {v10}, Ljava/util/ArrayList;->size()I
/* if-lez v0, :cond_4 */
/* .line 16 */
} // :cond_3
/* new-instance v0, Lc/h/j/c; */
/* invoke-direct {v0}, Lc/h/j/c;-><init>()V */
/* move-object/from16 v1, p4 */
/* .line 17 */
/* .line 18 */
/* new-instance v2, Lc/l/d/f2; */
/* invoke-direct {v2, v1, v12, v0}, Lc/l/d/f2;-><init>(Lc/l/d/l2;Landroidx/fragment/app/Fragment;Lc/h/j/c;)V */
(( c.l.d.x2 ) v13 ).a ( v12, v14, v0, v2 ); // invoke-virtual {v13, v12, v14, v0, v2}, Lc/l/d/x2;->a(Landroidx/fragment/app/Fragment;Ljava/lang/Object;Lc/h/j/c;Ljava/lang/Runnable;)V
} // :cond_4
if ( v14 != null) { // if-eqz v14, :cond_5
/* .line 19 */
c.l.d.n2 .a ( v13,v7,v12,v11 );
/* .line 20 */
(( c.l.d.x2 ) v13 ).a ( v15 ); // invoke-virtual {v13, v15}, Lc/l/d/x2;->a(Ljava/util/ArrayList;)Ljava/util/ArrayList;
/* move-object v0, v13 */
/* move-object v1, v14 */
/* move-object v2, v6 */
/* move-object v3, v9 */
/* move-object v4, v7 */
/* move-object v5, v11 */
/* move-object v6, v8 */
/* move-object v7, v15 */
/* .line 21 */
/* invoke-virtual/range {v0 ..v7}, Lc/l/d/x2;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V */
/* move-object/from16 v1, p0 */
/* .line 22 */
(( c.l.d.x2 ) v13 ).a ( v1, v14 ); // invoke-virtual {v13, v1, v14}, Lc/l/d/x2;->a(Landroid/view/ViewGroup;Ljava/lang/Object;)V
/* move-object v2, v10 */
/* move-object v3, v15 */
/* move-object v4, v12 */
/* move-object/from16 v5, p3 */
/* .line 23 */
/* invoke-virtual/range {v0 ..v5}, Lc/l/d/x2;->a(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Map;)V */
int v0 = 0; // const/4 v0, 0x0
/* .line 24 */
c.l.d.n2 .a ( v9,v0 );
/* .line 25 */
(( c.l.d.x2 ) v13 ).b ( v8, v10, v15 ); // invoke-virtual {v13, v8, v10, v15}, Lc/l/d/x2;->b(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
} // :cond_5
return;
} // .end method
public static void b ( Object p0, android.util.SparseArray p1, Boolean p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/a;", */
/* "Landroid/util/SparseArray<", */
/* "Lc/l/d/m2;", */
/* ">;Z)V" */
/* } */
} // .end annotation
/* .line 75 */
v0 = this.q;
(( c.l.d.o1 ) v0 ).w ( ); // invoke-virtual {v0}, Lc/l/d/o1;->w()Lc/l/d/n0;
v0 = (( c.l.d.n0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/l/d/n0;->a()Z
/* if-nez v0, :cond_0 */
return;
/* .line 76 */
} // :cond_0
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 77 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/l/d/d2; */
/* .line 78 */
c.l.d.n2 .a ( p0,v2,p1,v1,p2 );
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
return;
} // .end method
