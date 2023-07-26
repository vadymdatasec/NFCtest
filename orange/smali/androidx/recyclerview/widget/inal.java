public class inal {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x11 */
/* name = "v" */
} // .end annotation
/* # instance fields */
public final java.util.ArrayList a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroidx/recyclerview/widget/RecyclerView$d0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.ArrayList b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroidx/recyclerview/widget/RecyclerView$d0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final java.util.ArrayList c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroidx/recyclerview/widget/RecyclerView$d0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final java.util.List d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Landroidx/recyclerview/widget/RecyclerView$d0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Integer e;
public Integer f;
public androidx.recyclerview.widget.RecyclerView$u g;
public androidx.recyclerview.widget.RecyclerView$b0 h;
public final androidx.recyclerview.widget.RecyclerView i; //synthetic
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* .line 1 */
this.i = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.a = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
this.b = p1;
/* .line 4 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.c = p1;
/* .line 5 */
p1 = this.a;
/* .line 6 */
java.util.Collections .unmodifiableList ( p1 );
this.d = p1;
int p1 = 2; // const/4 p1, 0x2
/* .line 7 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$v;->e:I */
/* .line 8 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$v;->f:I */
return;
} // .end method
/* # virtual methods */
public Integer a ( Integer p0 ) {
/* .locals 3 */
/* if-ltz p1, :cond_1 */
/* .line 14 */
v0 = this.i;
v0 = this.i0;
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* if-ge p1, v0, :cond_1 */
/* .line 15 */
v0 = this.i;
v0 = this.i0;
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) v0 ).d ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
/* if-nez v0, :cond_0 */
/* .line 16 */
} // :cond_0
v0 = this.i;
v0 = this.e;
p1 = (( c.r.d.a ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/a;->c(I)I
/* .line 17 */
} // :cond_1
/* new-instance v0, Ljava/lang/IndexOutOfBoundsException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "invalid position "; // const-string v2, "invalid position "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = ".State item count is "; // const-string p1, ".State item count is "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p1 = this.i;
p1 = this.i0;
/* .line 18 */
p1 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
p1 = this.i;
(( androidx.recyclerview.widget.RecyclerView ) p1 ).n ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public androidx.recyclerview.widget.RecyclerView$d0 a ( Integer p0, Boolean p1 ) {
/* .locals 5 */
/* .line 122 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* .line 123 */
v3 = this.a;
(( java.util.ArrayList ) v3 ).get ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Landroidx/recyclerview/widget/RecyclerView$d0; */
/* .line 124 */
v4 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).B ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->B()Z
/* if-nez v4, :cond_1 */
v4 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).j ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I
/* if-ne v4, p1, :cond_1 */
/* .line 125 */
v4 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).p ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->p()Z
/* if-nez v4, :cond_1 */
v4 = this.i;
v4 = this.i0;
/* iget-boolean v4, v4, Landroidx/recyclerview/widget/RecyclerView$a0;->h:Z */
/* if-nez v4, :cond_0 */
v4 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).r ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->r()Z
/* if-nez v4, :cond_1 */
} // :cond_0
/* const/16 p1, 0x20 */
/* .line 126 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(I)V
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
/* if-nez p2, :cond_4 */
/* .line 127 */
v0 = this.i;
v0 = this.f;
(( c.r.d.c ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/c;->b(I)Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 128 */
androidx.recyclerview.widget.RecyclerView .l ( v0 );
/* .line 129 */
p2 = this.i;
p2 = this.f;
(( c.r.d.c ) p2 ).g ( v0 ); // invoke-virtual {p2, v0}, Lc/r/d/c;->g(Landroid/view/View;)V
/* .line 130 */
p2 = this.i;
p2 = this.f;
p2 = (( c.r.d.c ) p2 ).c ( v0 ); // invoke-virtual {p2, v0}, Lc/r/d/c;->c(Landroid/view/View;)I
int v1 = -1; // const/4 v1, -0x1
/* if-eq p2, v1, :cond_3 */
/* .line 131 */
v1 = this.i;
v1 = this.f;
(( c.r.d.c ) v1 ).a ( p2 ); // invoke-virtual {v1, p2}, Lc/r/d/c;->a(I)V
/* .line 132 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->c(Landroid/view/View;)V
/* const/16 p2, 0x2020 */
/* .line 133 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(I)V
/* .line 134 */
} // :cond_3
/* new-instance p2, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "layout index should not be -1 after unhiding a view:"; // const-string v1, "layout index should not be -1 after unhiding a view:"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
p1 = this.i;
/* .line 135 */
(( androidx.recyclerview.widget.RecyclerView ) p1 ).n ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
/* .line 136 */
} // :cond_4
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
} // :goto_1
/* if-ge v1, v0, :cond_7 */
/* .line 137 */
v2 = this.c;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroidx/recyclerview/widget/RecyclerView$d0; */
/* .line 138 */
v3 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v2 ).p ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$d0;->p()Z
/* if-nez v3, :cond_6 */
v3 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v2 ).j ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I
/* if-ne v3, p1, :cond_6 */
/* .line 139 */
v3 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v2 ).n ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$d0;->n()Z
/* if-nez v3, :cond_6 */
/* if-nez p2, :cond_5 */
/* .line 140 */
p1 = this.c;
(( java.util.ArrayList ) p1 ).remove ( v1 ); // invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
} // :cond_5
} // :cond_6
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_7
int p1 = 0; // const/4 p1, 0x0
} // .end method
public androidx.recyclerview.widget.RecyclerView$d0 a ( Integer p0, Boolean p1, Long p2 ) {
/* .locals 16 */
/* move-object/from16 v6, p0 */
/* move/from16 v3, p1 */
/* move/from16 v0, p2 */
/* if-ltz v3, :cond_18 */
/* .line 19 */
v1 = this.i;
v1 = this.i0;
v1 = (( androidx.recyclerview.widget.RecyclerView$a0 ) v1 ).a ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* if-ge v3, v1, :cond_18 */
/* .line 20 */
v1 = this.i;
v1 = this.i0;
v1 = (( androidx.recyclerview.widget.RecyclerView$a0 ) v1 ).d ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
int v2 = 0; // const/4 v2, 0x0
int v7 = 1; // const/4 v7, 0x1
int v8 = 0; // const/4 v8, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 21 */
/* invoke-virtual/range {p0 ..p1}, Landroidx/recyclerview/widget/RecyclerView$v;->b(I)Landroidx/recyclerview/widget/RecyclerView$d0; */
if ( v1 != null) { // if-eqz v1, :cond_1
int v4 = 1; // const/4 v4, 0x1
} // :cond_0
/* move-object v1, v2 */
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-nez v1, :cond_6 */
/* .line 22 */
/* invoke-virtual/range {p0 ..p2}, Landroidx/recyclerview/widget/RecyclerView$v;->a(IZ)Landroidx/recyclerview/widget/RecyclerView$d0; */
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 23 */
v5 = (( androidx.recyclerview.widget.RecyclerView$v ) v6 ).f ( v1 ); // invoke-virtual {v6, v1}, Landroidx/recyclerview/widget/RecyclerView$v;->f(Landroidx/recyclerview/widget/RecyclerView$d0;)Z
/* if-nez v5, :cond_5 */
/* if-nez v0, :cond_4 */
int v5 = 4; // const/4 v5, 0x4
/* .line 24 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).a ( v5 ); // invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(I)V
/* .line 25 */
v5 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).s ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->s()Z
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 26 */
v5 = this.i;
v9 = this.a;
(( androidx.recyclerview.widget.RecyclerView ) v5 ).removeDetachedView ( v9, v8 ); // invoke-virtual {v5, v9, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V
/* .line 27 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).A ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->A()V
/* .line 28 */
} // :cond_2
v5 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).B ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->B()Z
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 29 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).c ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->c()V
/* .line 30 */
} // :cond_3
} // :goto_1
(( androidx.recyclerview.widget.RecyclerView$v ) v6 ).d ( v1 ); // invoke-virtual {v6, v1}, Landroidx/recyclerview/widget/RecyclerView$v;->d(Landroidx/recyclerview/widget/RecyclerView$d0;)V
} // :cond_4
/* move-object v1, v2 */
} // :cond_5
int v4 = 1; // const/4 v4, 0x1
} // :cond_6
} // :goto_2
/* if-nez v1, :cond_10 */
/* .line 31 */
v5 = this.i;
v5 = this.e;
v5 = (( c.r.d.a ) v5 ).c ( v3 ); // invoke-virtual {v5, v3}, Lc/r/d/a;->c(I)I
/* if-ltz v5, :cond_f */
/* .line 32 */
v9 = this.i;
v9 = this.m;
v9 = (( androidx.recyclerview.widget.RecyclerView$g ) v9 ).a ( ); // invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$g;->a()I
/* if-ge v5, v9, :cond_f */
/* .line 33 */
v9 = this.i;
v9 = this.m;
v9 = (( androidx.recyclerview.widget.RecyclerView$g ) v9 ).b ( v5 ); // invoke-virtual {v9, v5}, Landroidx/recyclerview/widget/RecyclerView$g;->b(I)I
/* .line 34 */
v10 = this.i;
v10 = this.m;
v10 = (( androidx.recyclerview.widget.RecyclerView$g ) v10 ).b ( ); // invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$g;->b()Z
if ( v10 != null) { // if-eqz v10, :cond_7
/* .line 35 */
v1 = this.i;
v1 = this.m;
(( androidx.recyclerview.widget.RecyclerView$g ) v1 ).a ( v5 ); // invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView$g;->a(I)J
/* move-result-wide v10 */
(( androidx.recyclerview.widget.RecyclerView$v ) v6 ).a ( v10, v11, v9, v0 ); // invoke-virtual {v6, v10, v11, v9, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->a(JIZ)Landroidx/recyclerview/widget/RecyclerView$d0;
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 36 */
/* iput v5, v1, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
int v4 = 1; // const/4 v4, 0x1
} // :cond_7
/* if-nez v1, :cond_a */
/* .line 37 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 38 */
(( androidx.recyclerview.widget.RecyclerView$b0 ) v0 ).a ( v6, v3, v9 ); // invoke-virtual {v0, v6, v3, v9}, Landroidx/recyclerview/widget/RecyclerView$b0;->a(Landroidx/recyclerview/widget/RecyclerView$v;II)Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 39 */
v1 = this.i;
(( androidx.recyclerview.widget.RecyclerView ) v1 ).e ( v0 ); // invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->e(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$d0;
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 40 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).z ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->z()Z
/* if-nez v0, :cond_8 */
/* .line 41 */
} // :cond_8
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "getViewForPositionAndType returned a view that is ignored.You must call stopIgnoring before returning this view."; // const-string v2, "getViewForPositionAndType returned a view that is ignored.You must call stopIgnoring before returning this view."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.i;
/* .line 42 */
(( androidx.recyclerview.widget.RecyclerView ) v2 ).n ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 43 */
} // :cond_9
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"; // const-string v2, "getViewForPositionAndType returned a view which does not have a ViewHolder"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.i;
/* .line 44 */
(( androidx.recyclerview.widget.RecyclerView ) v2 ).n ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_a
} // :goto_3
/* if-nez v1, :cond_c */
/* .line 45 */
/* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/RecyclerView$v;->d()Landroidx/recyclerview/widget/RecyclerView$u; */
(( androidx.recyclerview.widget.RecyclerView$u ) v0 ).a ( v9 ); // invoke-virtual {v0, v9}, Landroidx/recyclerview/widget/RecyclerView$u;->a(I)Landroidx/recyclerview/widget/RecyclerView$d0;
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 46 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).w ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->w()V
/* .line 47 */
/* sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->A0:Z */
if ( v1 != null) { // if-eqz v1, :cond_b
/* .line 48 */
(( androidx.recyclerview.widget.RecyclerView$v ) v6 ).c ( v0 ); // invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->c(Landroidx/recyclerview/widget/RecyclerView$d0;)V
} // :cond_b
/* move-object v1, v0 */
} // :cond_c
/* if-nez v1, :cond_10 */
/* .line 49 */
v0 = this.i;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).getNanoTime ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J
/* move-result-wide v0 */
/* const-wide v10, 0x7fffffffffffffffL */
/* cmp-long v5, p3, v10 */
if ( v5 != null) { // if-eqz v5, :cond_d
/* .line 50 */
v10 = this.g;
/* move v11, v9 */
/* move-wide v12, v0 */
/* move-wide/from16 v14, p3 */
/* .line 51 */
v5 = /* invoke-virtual/range {v10 ..v15}, Landroidx/recyclerview/widget/RecyclerView$u;->b(IJJ)Z */
/* if-nez v5, :cond_d */
/* .line 52 */
} // :cond_d
v2 = this.i;
v5 = this.m;
(( androidx.recyclerview.widget.RecyclerView$g ) v5 ).a ( v2, v9 ); // invoke-virtual {v5, v2, v9}, Landroidx/recyclerview/widget/RecyclerView$g;->a(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
/* .line 53 */
/* sget-boolean v5, Landroidx/recyclerview/widget/RecyclerView;->D0:Z */
if ( v5 != null) { // if-eqz v5, :cond_e
/* .line 54 */
v5 = this.a;
androidx.recyclerview.widget.RecyclerView .k ( v5 );
if ( v5 != null) { // if-eqz v5, :cond_e
/* .line 55 */
/* new-instance v10, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v10, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.b = v10;
/* .line 56 */
} // :cond_e
v5 = this.i;
(( androidx.recyclerview.widget.RecyclerView ) v5 ).getNanoTime ( ); // invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J
/* move-result-wide v10 */
/* .line 57 */
v5 = this.g;
/* sub-long/2addr v10, v0 */
(( androidx.recyclerview.widget.RecyclerView$u ) v5 ).b ( v9, v10, v11 ); // invoke-virtual {v5, v9, v10, v11}, Landroidx/recyclerview/widget/RecyclerView$u;->b(IJ)V
/* move-object v9, v2 */
/* .line 58 */
} // :cond_f
/* new-instance v0, Ljava/lang/IndexOutOfBoundsException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Inconsistency detected.Invalid item position "; // const-string v2, "Inconsistency detected.Invalid item position "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "(offset:"; // const-string v2, "(offset:"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ").state:"; // const-string v2, ").state:"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.i;
v2 = this.i0;
/* .line 59 */
v2 = (( androidx.recyclerview.widget.RecyclerView$a0 ) v2 ).a ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
v2 = this.i;
(( androidx.recyclerview.widget.RecyclerView ) v2 ).n ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_10
/* move-object v9, v1 */
} // :goto_4
/* move v10, v4 */
if ( v10 != null) { // if-eqz v10, :cond_11
/* .line 60 */
v0 = this.i;
v0 = this.i0;
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) v0 ).d ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
/* if-nez v0, :cond_11 */
/* const/16 v0, 0x2000 */
/* .line 61 */
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v9 ).b ( v0 ); // invoke-virtual {v9, v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->b(I)Z
if ( v1 != null) { // if-eqz v1, :cond_11
/* .line 62 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v9 ).a ( v8, v0 ); // invoke-virtual {v9, v8, v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(II)V
/* .line 63 */
v0 = this.i;
v0 = this.i0;
/* iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView$a0;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_11
/* .line 64 */
v0 = androidx.recyclerview.widget.RecyclerView$l .e ( v9 );
/* or-int/lit16 v0, v0, 0x1000 */
/* .line 65 */
v1 = this.i;
v2 = this.N;
v1 = this.i0;
/* .line 66 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v9 ).l ( ); // invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$d0;->l()Ljava/util/List;
/* .line 67 */
(( androidx.recyclerview.widget.RecyclerView$l ) v2 ).a ( v1, v9, v0, v4 ); // invoke-virtual {v2, v1, v9, v0, v4}, Landroidx/recyclerview/widget/RecyclerView$l;->a(Landroidx/recyclerview/widget/RecyclerView$a0;Landroidx/recyclerview/widget/RecyclerView$d0;ILjava/util/List;)Landroidx/recyclerview/widget/RecyclerView$l$b;
/* .line 68 */
v1 = this.i;
(( androidx.recyclerview.widget.RecyclerView ) v1 ).a ( v9, v0 ); // invoke-virtual {v1, v9, v0}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$l$b;)V
/* .line 69 */
} // :cond_11
v0 = this.i;
v0 = this.i0;
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) v0 ).d ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_12
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v9 ).o ( ); // invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$d0;->o()Z
if ( v0 != null) { // if-eqz v0, :cond_12
/* .line 70 */
/* iput v3, v9, Landroidx/recyclerview/widget/RecyclerView$d0;->g:I */
/* .line 71 */
} // :cond_12
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v9 ).o ( ); // invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$d0;->o()Z
if ( v0 != null) { // if-eqz v0, :cond_14
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v9 ).v ( ); // invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$d0;->v()Z
/* if-nez v0, :cond_14 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v9 ).p ( ); // invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$d0;->p()Z
if ( v0 != null) { // if-eqz v0, :cond_13
} // :cond_13
} // :goto_5
int v0 = 0; // const/4 v0, 0x0
/* .line 72 */
} // :cond_14
} // :goto_6
v0 = this.i;
v0 = this.e;
v2 = (( c.r.d.a ) v0 ).c ( v3 ); // invoke-virtual {v0, v3}, Lc/r/d/a;->c(I)I
/* move-object/from16 v0, p0 */
/* move-object v1, v9 */
/* move/from16 v3, p1 */
/* move-wide/from16 v4, p3 */
/* .line 73 */
v0 = /* invoke-virtual/range {v0 ..v5}, Landroidx/recyclerview/widget/RecyclerView$v;->a(Landroidx/recyclerview/widget/RecyclerView$d0;IIJ)Z */
/* .line 74 */
} // :goto_7
v1 = this.a;
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* if-nez v1, :cond_15 */
/* .line 75 */
v1 = this.i;
(( androidx.recyclerview.widget.RecyclerView ) v1 ).generateDefaultLayoutParams ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroidx/recyclerview/widget/RecyclerView$p; */
/* .line 76 */
v2 = this.a;
(( android.view.View ) v2 ).setLayoutParams ( v1 ); // invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 77 */
} // :cond_15
v2 = this.i;
v2 = (( androidx.recyclerview.widget.RecyclerView ) v2 ).checkLayoutParams ( v1 ); // invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
/* if-nez v2, :cond_16 */
/* .line 78 */
v2 = this.i;
(( androidx.recyclerview.widget.RecyclerView ) v2 ).generateLayoutParams ( v1 ); // invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroidx/recyclerview/widget/RecyclerView$p; */
/* .line 79 */
v2 = this.a;
(( android.view.View ) v2 ).setLayoutParams ( v1 ); // invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 80 */
} // :cond_16
/* check-cast v1, Landroidx/recyclerview/widget/RecyclerView$p; */
/* .line 81 */
} // :goto_8
this.a = v9;
if ( v10 != null) { // if-eqz v10, :cond_17
if ( v0 != null) { // if-eqz v0, :cond_17
} // :cond_17
int v7 = 0; // const/4 v7, 0x0
/* .line 82 */
} // :goto_9
/* iput-boolean v7, v1, Landroidx/recyclerview/widget/RecyclerView$p;->d:Z */
/* .line 83 */
} // :cond_18
/* new-instance v0, Ljava/lang/IndexOutOfBoundsException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Invalid item position "; // const-string v2, "Invalid item position "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "("; // const-string v2, "("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ").Item count:"; // const-string v2, ").Item count:"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.i;
v2 = this.i0;
/* .line 84 */
v2 = (( androidx.recyclerview.widget.RecyclerView$a0 ) v2 ).a ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
v2 = this.i;
/* .line 85 */
(( androidx.recyclerview.widget.RecyclerView ) v2 ).n ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public androidx.recyclerview.widget.RecyclerView$d0 a ( Long p0, Integer p1, Boolean p2 ) {
/* .locals 6 */
/* .line 141 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_3 */
/* .line 142 */
v1 = this.a;
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroidx/recyclerview/widget/RecyclerView$d0; */
/* .line 143 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).h ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()J
/* move-result-wide v2 */
/* cmp-long v4, v2, p1 */
/* if-nez v4, :cond_2 */
v2 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).B ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->B()Z
/* if-nez v2, :cond_2 */
/* .line 144 */
v2 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).i ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->i()I
/* if-ne p3, v2, :cond_1 */
/* const/16 p1, 0x20 */
/* .line 145 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(I)V
/* .line 146 */
p1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).r ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->r()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 147 */
p1 = this.i;
p1 = this.i0;
p1 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).d ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
/* if-nez p1, :cond_0 */
int p1 = 2; // const/4 p1, 0x2
/* const/16 p2, 0xe */
/* .line 148 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(II)V
} // :cond_0
} // :cond_1
/* if-nez p4, :cond_2 */
/* .line 149 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).remove ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* .line 150 */
v2 = this.i;
v3 = this.a;
int v4 = 0; // const/4 v4, 0x0
(( androidx.recyclerview.widget.RecyclerView ) v2 ).removeDetachedView ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V
/* .line 151 */
v1 = this.a;
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$v;->a(Landroid/view/View;)V
} // :cond_2
/* add-int/lit8 v0, v0, -0x1 */
/* .line 152 */
} // :cond_3
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_1
int v1 = 0; // const/4 v1, 0x0
/* if-ltz v0, :cond_7 */
/* .line 153 */
v2 = this.c;
(( java.util.ArrayList ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroidx/recyclerview/widget/RecyclerView$d0; */
/* .line 154 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v2 ).h ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()J
/* move-result-wide v3 */
/* cmp-long v5, v3, p1 */
/* if-nez v5, :cond_6 */
v3 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v2 ).n ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$d0;->n()Z
/* if-nez v3, :cond_6 */
/* .line 155 */
v3 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v2 ).i ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$d0;->i()I
/* if-ne p3, v3, :cond_5 */
/* if-nez p4, :cond_4 */
/* .line 156 */
p1 = this.c;
(( java.util.ArrayList ) p1 ).remove ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
} // :cond_4
} // :cond_5
/* if-nez p4, :cond_6 */
/* .line 157 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->e(I)V
} // :cond_6
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_7
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$v;->i()V
return;
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* .line 160 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 161 */
v2 = this.c;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroidx/recyclerview/widget/RecyclerView$d0; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 162 */
/* iget v3, v2, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* if-lt v3, p1, :cond_0 */
int v3 = 1; // const/4 v3, 0x1
/* .line 163 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v2 ).a ( p2, v3 ); // invoke-virtual {v2, p2, v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(IZ)V
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public void a ( Integer p0, Integer p1, Boolean p2 ) {
/* .locals 4 */
/* add-int v0, p1, p2 */
/* .line 164 */
v1 = this.c;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v1, v1, -0x1 */
} // :goto_0
/* if-ltz v1, :cond_2 */
/* .line 165 */
v2 = this.c;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroidx/recyclerview/widget/RecyclerView$d0; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 166 */
/* iget v3, v2, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* if-lt v3, v0, :cond_0 */
/* neg-int v3, p2 */
/* .line 167 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v2 ).a ( v3, p3 ); // invoke-virtual {v2, v3, p3}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(IZ)V
} // :cond_0
/* if-lt v3, p1, :cond_1 */
/* const/16 v3, 0x8 */
/* .line 168 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(I)V
/* .line 169 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).e ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$v;->e(I)V
} // :cond_1
} // :goto_1
/* add-int/lit8 v1, v1, -0x1 */
} // :cond_2
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 1 */
/* .line 117 */
androidx.recyclerview.widget.RecyclerView .l ( p1 );
int v0 = 0; // const/4 v0, 0x0
/* .line 118 */
this.n = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 119 */
/* iput-boolean v0, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->o:Z */
/* .line 120 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).c ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->c()V
/* .line 121 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$v;->d(Landroidx/recyclerview/widget/RecyclerView$d0;)V
return;
} // .end method
public final void a ( android.view.ViewGroup p0, Boolean p1 ) {
/* .locals 4 */
/* .line 96 */
v0 = (( android.view.ViewGroup ) p1 ).getChildCount ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 97 */
(( android.view.ViewGroup ) p1 ).getChildAt ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 98 */
/* instance-of v3, v2, Landroid/view/ViewGroup; */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 99 */
/* check-cast v2, Landroid/view/ViewGroup; */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).a ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Landroidx/recyclerview/widget/RecyclerView$v;->a(Landroid/view/ViewGroup;Z)V
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
/* if-nez p2, :cond_2 */
return;
/* .line 100 */
} // :cond_2
p2 = (( android.view.ViewGroup ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getVisibility()I
int v0 = 4; // const/4 v0, 0x4
/* if-ne p2, v0, :cond_3 */
int p2 = 0; // const/4 p2, 0x0
/* .line 101 */
(( android.view.ViewGroup ) p1 ).setVisibility ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setVisibility(I)V
/* .line 102 */
(( android.view.ViewGroup ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V
/* .line 103 */
} // :cond_3
p2 = (( android.view.ViewGroup ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getVisibility()I
/* .line 104 */
(( android.view.ViewGroup ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V
/* .line 105 */
(( android.view.ViewGroup ) p1 ).setVisibility ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setVisibility(I)V
} // :goto_1
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$b0 p0 ) {
/* .locals 0 */
/* .line 170 */
this.h = p1;
return;
} // .end method
public final void a ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 2 */
/* .line 86 */
v0 = this.i;
v0 = (( androidx.recyclerview.widget.RecyclerView ) v0 ).v ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->v()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 87 */
p1 = this.a;
/* .line 88 */
v0 = c.h.n.v0 .m ( p1 );
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 89 */
c.h.n.v0 .g ( p1,v0 );
/* .line 90 */
} // :cond_0
v0 = this.i;
v0 = this.p0;
/* if-nez v0, :cond_1 */
return;
/* .line 91 */
} // :cond_1
(( c.r.d.j0 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/r/d/j0;->b()Lc/h/n/d;
/* .line 92 */
/* instance-of v1, v0, Lc/r/d/i0; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 93 */
/* move-object v1, v0 */
/* check-cast v1, Lc/r/d/i0; */
/* .line 94 */
(( c.r.d.i0 ) v1 ).d ( p1 ); // invoke-virtual {v1, p1}, Lc/r/d/i0;->d(Landroid/view/View;)V
/* .line 95 */
} // :cond_2
c.h.n.v0 .a ( p1,v0 );
} // :cond_3
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$d0 p0, Boolean p1 ) {
/* .locals 4 */
/* .line 106 */
androidx.recyclerview.widget.RecyclerView .e ( p1 );
/* .line 107 */
v0 = this.a;
/* .line 108 */
v1 = this.i;
v1 = this.p0;
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 109 */
(( c.r.d.j0 ) v1 ).b ( ); // invoke-virtual {v1}, Lc/r/d/j0;->b()Lc/h/n/d;
/* .line 110 */
/* instance-of v3, v1, Lc/r/d/i0; */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 111 */
/* check-cast v1, Lc/r/d/i0; */
/* .line 112 */
(( c.r.d.i0 ) v1 ).c ( v0 ); // invoke-virtual {v1, v0}, Lc/r/d/i0;->c(Landroid/view/View;)Lc/h/n/d;
} // :cond_0
/* move-object v1, v2 */
/* .line 113 */
} // :goto_0
c.h.n.v0 .a ( v0,v1 );
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 114 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$v;->b(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* .line 115 */
} // :cond_2
this.r = v2;
/* .line 116 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$v;->d()Landroidx/recyclerview/widget/RecyclerView$u;
(( androidx.recyclerview.widget.RecyclerView$u ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$u;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$g p0, androidx.recyclerview.widget.RecyclerView$g p1, Boolean p2 ) {
/* .locals 1 */
/* .line 158 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$v;->a()V
/* .line 159 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$v;->d()Landroidx/recyclerview/widget/RecyclerView$u;
(( androidx.recyclerview.widget.RecyclerView$u ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$u;->a(Landroidx/recyclerview/widget/RecyclerView$g;Landroidx/recyclerview/widget/RecyclerView$g;Z)V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$u p0 ) {
/* .locals 1 */
/* .line 171 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 172 */
(( androidx.recyclerview.widget.RecyclerView$u ) v0 ).c ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$u;->c()V
/* .line 173 */
} // :cond_0
this.g = p1;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 174 */
p1 = this.i;
(( androidx.recyclerview.widget.RecyclerView ) p1 ).getAdapter ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 175 */
p1 = this.g;
(( androidx.recyclerview.widget.RecyclerView$u ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$u;->a()V
} // :cond_1
return;
} // .end method
public final Boolean a ( androidx.recyclerview.widget.RecyclerView$d0 p0, Integer p1, Integer p2, Long p3 ) {
/* .locals 9 */
/* .line 3 */
v0 = this.i;
this.r = v0;
/* .line 4 */
v2 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).i ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->i()I
/* .line 5 */
v0 = this.i;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).getNanoTime ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J
/* move-result-wide v7 */
/* const-wide v0, 0x7fffffffffffffffL */
/* cmp-long v3, p4, v0 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 6 */
v1 = this.g;
/* move-wide v3, v7 */
/* move-wide v5, p4 */
/* .line 7 */
p4 = /* invoke-virtual/range {v1 ..v6}, Landroidx/recyclerview/widget/RecyclerView$u;->a(IJJ)Z */
/* if-nez p4, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 8 */
} // :cond_0
p4 = this.i;
p4 = this.m;
(( androidx.recyclerview.widget.RecyclerView$g ) p4 ).a ( p1, p2 ); // invoke-virtual {p4, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->a(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
/* .line 9 */
p2 = this.i;
(( androidx.recyclerview.widget.RecyclerView ) p2 ).getNanoTime ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J
/* move-result-wide p4 */
/* .line 10 */
p2 = this.g;
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).i ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->i()I
/* sub-long/2addr p4, v7 */
(( androidx.recyclerview.widget.RecyclerView$u ) p2 ).a ( v0, p4, p5 ); // invoke-virtual {p2, v0, p4, p5}, Landroidx/recyclerview/widget/RecyclerView$u;->a(IJ)V
/* .line 11 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$v;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* .line 12 */
p2 = this.i;
p2 = this.i0;
p2 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).d ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 13 */
/* iput p3, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->g:I */
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
} // .end method
public android.view.View b ( Integer p0, Boolean p1 ) {
/* .locals 2 */
/* const-wide v0, 0x7fffffffffffffffL */
/* .line 1 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).a ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$v;->a(IZJ)Landroidx/recyclerview/widget/RecyclerView$d0;
p1 = this.a;
} // .end method
public androidx.recyclerview.widget.RecyclerView$d0 b ( Integer p0 ) {
/* .locals 9 */
/* .line 12 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-nez v0, :cond_0 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* const/16 v4, 0x20 */
/* if-ge v3, v0, :cond_2 */
/* .line 13 */
v5 = this.b;
(( java.util.ArrayList ) v5 ).get ( v3 ); // invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Landroidx/recyclerview/widget/RecyclerView$d0; */
/* .line 14 */
v6 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v5 ).B ( ); // invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$d0;->B()Z
/* if-nez v6, :cond_1 */
v6 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v5 ).j ( ); // invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I
/* if-ne v6, p1, :cond_1 */
/* .line 15 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v5 ).a ( v4 ); // invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(I)V
} // :cond_1
/* add-int/lit8 v3, v3, 0x1 */
/* .line 16 */
} // :cond_2
v3 = this.i;
v3 = this.m;
v3 = (( androidx.recyclerview.widget.RecyclerView$g ) v3 ).b ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$g;->b()Z
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 17 */
v3 = this.i;
v3 = this.e;
p1 = (( c.r.d.a ) v3 ).c ( p1 ); // invoke-virtual {v3, p1}, Lc/r/d/a;->c(I)I
/* if-lez p1, :cond_4 */
/* .line 18 */
v3 = this.i;
v3 = this.m;
v3 = (( androidx.recyclerview.widget.RecyclerView$g ) v3 ).a ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$g;->a()I
/* if-ge p1, v3, :cond_4 */
/* .line 19 */
v3 = this.i;
v3 = this.m;
(( androidx.recyclerview.widget.RecyclerView$g ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->a(I)J
/* move-result-wide v5 */
} // :goto_1
/* if-ge v2, v0, :cond_4 */
/* .line 20 */
p1 = this.b;
(( java.util.ArrayList ) p1 ).get ( v2 ); // invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$d0; */
/* .line 21 */
v3 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).B ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->B()Z
/* if-nez v3, :cond_3 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).h ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()J
/* move-result-wide v7 */
/* cmp-long v3, v7, v5 */
/* if-nez v3, :cond_3 */
/* .line 22 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).a ( v4 ); // invoke-virtual {p1, v4}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(I)V
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_4
} // :goto_2
} // .end method
public void b ( ) {
/* .locals 4 */
/* .line 34 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_0 */
/* .line 35 */
v3 = this.c;
(( java.util.ArrayList ) v3 ).get ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Landroidx/recyclerview/widget/RecyclerView$d0; */
/* .line 36 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).a ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->a()V
/* add-int/lit8 v2, v2, 0x1 */
/* .line 37 */
} // :cond_0
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
/* if-ge v2, v0, :cond_1 */
/* .line 38 */
v3 = this.a;
(( java.util.ArrayList ) v3 ).get ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Landroidx/recyclerview/widget/RecyclerView$d0; */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).a ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->a()V
/* add-int/lit8 v2, v2, 0x1 */
/* .line 39 */
} // :cond_1
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 40 */
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
} // :goto_2
/* if-ge v1, v0, :cond_2 */
/* .line 41 */
v2 = this.b;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroidx/recyclerview/widget/RecyclerView$d0; */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v2 ).a ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$d0;->a()V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
return;
} // .end method
public void b ( Integer p0, Integer p1 ) {
/* .locals 8 */
/* if-ge p1, p2, :cond_0 */
int v0 = -1; // const/4 v0, -0x1
/* move v1, p1 */
/* move v2, p2 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* move v2, p1 */
/* move v1, p2 */
/* .line 29 */
} // :goto_0
v3 = this.c;
v3 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :goto_1
/* if-ge v5, v3, :cond_4 */
/* .line 30 */
v6 = this.c;
(( java.util.ArrayList ) v6 ).get ( v5 ); // invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v6, Landroidx/recyclerview/widget/RecyclerView$d0; */
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 31 */
/* iget v7, v6, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* if-lt v7, v1, :cond_3 */
/* if-le v7, v2, :cond_1 */
} // :cond_1
/* if-ne v7, p1, :cond_2 */
/* sub-int v7, p2, p1 */
/* .line 32 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v6 ).a ( v7, v4 ); // invoke-virtual {v6, v7, v4}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(IZ)V
/* .line 33 */
} // :cond_2
(( androidx.recyclerview.widget.RecyclerView$d0 ) v6 ).a ( v0, v4 ); // invoke-virtual {v6, v0, v4}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(IZ)V
} // :cond_3
} // :goto_2
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_4
return;
} // .end method
public void b ( android.view.View p0 ) {
/* .locals 3 */
/* .line 2 */
androidx.recyclerview.widget.RecyclerView .l ( p1 );
/* .line 3 */
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).t ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->t()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
v1 = this.i;
int v2 = 0; // const/4 v2, 0x0
(( androidx.recyclerview.widget.RecyclerView ) v1 ).removeDetachedView ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V
/* .line 5 */
} // :cond_0
p1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).s ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->s()Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 6 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).A ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->A()V
/* .line 7 */
} // :cond_1
p1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).B ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->B()Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 8 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).c ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->c()V
/* .line 9 */
} // :cond_2
} // :goto_0
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->d(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* .line 10 */
p1 = this.i;
p1 = this.N;
if ( p1 != null) { // if-eqz p1, :cond_3
p1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).q ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->q()Z
/* if-nez p1, :cond_3 */
/* .line 11 */
p1 = this.i;
p1 = this.N;
(( androidx.recyclerview.widget.RecyclerView$l ) p1 ).c ( v0 ); // invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$l;->c(Landroidx/recyclerview/widget/RecyclerView$d0;)V
} // :cond_3
return;
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 2 */
/* .line 23 */
v0 = this.i;
v0 = this.o;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 24 */
/* .line 25 */
} // :cond_0
v0 = this.i;
v0 = this.m;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 26 */
(( androidx.recyclerview.widget.RecyclerView$g ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->d(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* .line 27 */
} // :cond_1
v0 = this.i;
v1 = this.i0;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 28 */
v0 = this.g;
(( c.r.d.s0 ) v0 ).h ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/s0;->h(Landroidx/recyclerview/widget/RecyclerView$d0;)V
} // :cond_2
return;
} // .end method
public android.view.View c ( Integer p0 ) {
/* .locals 1 */
/* .line 15 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$d0; */
p1 = this.a;
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 16 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 17 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 18 */
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
} // :cond_0
return;
} // .end method
public void c ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* add-int/2addr p2, p1 */
/* .line 19 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_2 */
/* .line 20 */
v1 = this.c;
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroidx/recyclerview/widget/RecyclerView$d0; */
/* if-nez v1, :cond_0 */
/* .line 21 */
} // :cond_0
/* iget v2, v1, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* if-lt v2, p1, :cond_1 */
/* if-ge v2, p2, :cond_1 */
int v2 = 2; // const/4 v2, 0x2
/* .line 22 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(I)V
/* .line 23 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->e(I)V
} // :cond_1
} // :goto_1
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_2
return;
} // .end method
public void c ( android.view.View p0 ) {
/* .locals 2 */
/* .line 3 */
androidx.recyclerview.widget.RecyclerView .l ( p1 );
/* const/16 v0, 0xc */
/* .line 4 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->b(I)Z
/* if-nez v0, :cond_2 */
/* .line 5 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).u ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->u()Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.i;
v0 = (( androidx.recyclerview.widget.RecyclerView ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->b(Landroidx/recyclerview/widget/RecyclerView$d0;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
} // :cond_0
v0 = this.b;
/* if-nez v0, :cond_1 */
/* .line 7 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* .line 8 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).a ( p0, v0 ); // invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(Landroidx/recyclerview/widget/RecyclerView$v;Z)V
/* .line 9 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 10 */
} // :cond_2
} // :goto_0
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).p ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->p()Z
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).r ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->r()Z
/* if-nez v0, :cond_4 */
v0 = this.i;
v0 = this.m;
v0 = (( androidx.recyclerview.widget.RecyclerView$g ) v0 ).b ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 11 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Called scrap view with an invalid view.Invalid views cannot be reused from scrap, they should rebound from recycler pool."; // const-string v1, "Called scrap view with an invalid view.Invalid views cannot be reused from scrap, they should rebound from recycler pool."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.i;
/* .line 12 */
(( androidx.recyclerview.widget.RecyclerView ) v1 ).n ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_4
} // :goto_1
int v0 = 0; // const/4 v0, 0x0
/* .line 13 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).a ( p0, v0 ); // invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(Landroidx/recyclerview/widget/RecyclerView$v;Z)V
/* .line 14 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :goto_2
return;
} // .end method
public final void c ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 1 */
/* .line 1 */
p1 = this.a;
/* instance-of v0, p1, Landroid/view/ViewGroup; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p1, Landroid/view/ViewGroup; */
int v0 = 0; // const/4 v0, 0x0
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->a(Landroid/view/ViewGroup;Z)V
} // :cond_0
return;
} // .end method
public android.view.View d ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).b ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->b(IZ)Landroid/view/View;
} // .end method
public androidx.recyclerview.widget.RecyclerView$u d ( ) {
/* .locals 1 */
/* .line 29 */
v0 = this.g;
/* if-nez v0, :cond_0 */
/* .line 30 */
/* new-instance v0, Landroidx/recyclerview/widget/RecyclerView$u; */
/* invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$u;-><init>()V */
this.g = v0;
/* .line 31 */
} // :cond_0
v0 = this.g;
} // .end method
public void d ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 6 */
/* .line 2 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).s ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->s()Z
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-nez v0, :cond_d */
v0 = this.a;
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
if ( v0 != null) { // if-eqz v0, :cond_0
/* goto/16 :goto_7 */
/* .line 3 */
} // :cond_0
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).t ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->t()Z
/* if-nez v0, :cond_c */
/* .line 4 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).z ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->z()Z
/* if-nez v0, :cond_b */
/* .line 5 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).f ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->f()Z
/* .line 6 */
v3 = this.i;
v3 = this.m;
if ( v3 != null) { // if-eqz v3, :cond_1
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
v3 = (( androidx.recyclerview.widget.RecyclerView$g ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
int v3 = 1; // const/4 v3, 0x1
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-nez v3, :cond_3 */
/* .line 8 */
v3 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).q ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->q()Z
if ( v3 != null) { // if-eqz v3, :cond_2
} // :cond_2
} // :goto_1
int v2 = 0; // const/4 v2, 0x0
/* .line 9 */
} // :cond_3
} // :goto_2
/* iget v3, p0, Landroidx/recyclerview/widget/RecyclerView$v;->f:I */
/* if-lez v3, :cond_8 */
/* const/16 v3, 0x20e */
/* .line 10 */
v3 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).b ( v3 ); // invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->b(I)Z
/* if-nez v3, :cond_8 */
/* .line 11 */
v3 = this.c;
v3 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
/* .line 12 */
/* iget v4, p0, Landroidx/recyclerview/widget/RecyclerView$v;->f:I */
/* if-lt v3, v4, :cond_4 */
/* if-lez v3, :cond_4 */
/* .line 13 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).e ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$v;->e(I)V
/* add-int/lit8 v3, v3, -0x1 */
/* .line 14 */
} // :cond_4
/* sget-boolean v4, Landroidx/recyclerview/widget/RecyclerView;->D0:Z */
if ( v4 != null) { // if-eqz v4, :cond_7
/* if-lez v3, :cond_7 */
v4 = this.i;
v4 = this.h0;
/* iget v5, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* .line 15 */
v4 = (( c.r.d.u$a ) v4 ).a ( v5 ); // invoke-virtual {v4, v5}, Lc/r/d/u$a;->a(I)Z
/* if-nez v4, :cond_7 */
/* add-int/lit8 v3, v3, -0x1 */
} // :goto_3
/* if-ltz v3, :cond_6 */
/* .line 16 */
v4 = this.c;
(( java.util.ArrayList ) v4 ).get ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Landroidx/recyclerview/widget/RecyclerView$d0; */
/* iget v4, v4, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* .line 17 */
v5 = this.i;
v5 = this.h0;
v4 = (( c.r.d.u$a ) v5 ).a ( v4 ); // invoke-virtual {v5, v4}, Lc/r/d/u$a;->a(I)Z
/* if-nez v4, :cond_5 */
} // :cond_5
/* add-int/lit8 v3, v3, -0x1 */
} // :cond_6
} // :goto_4
/* add-int/2addr v3, v2 */
/* .line 18 */
} // :cond_7
v4 = this.c;
(( java.util.ArrayList ) v4 ).add ( v3, p1 ); // invoke-virtual {v4, v3, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
int v3 = 1; // const/4 v3, 0x1
} // :cond_8
int v3 = 0; // const/4 v3, 0x0
} // :goto_5
/* if-nez v3, :cond_9 */
/* .line 19 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).a ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Landroidx/recyclerview/widget/RecyclerView$v;->a(Landroidx/recyclerview/widget/RecyclerView$d0;Z)V
/* move v1, v3 */
} // :cond_9
/* move v1, v3 */
/* .line 20 */
} // :goto_6
v3 = this.i;
v3 = this.g;
(( c.r.d.s0 ) v3 ).h ( p1 ); // invoke-virtual {v3, p1}, Lc/r/d/s0;->h(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* if-nez v1, :cond_a */
/* if-nez v2, :cond_a */
if ( v0 != null) { // if-eqz v0, :cond_a
int v0 = 0; // const/4 v0, 0x0
/* .line 21 */
this.r = v0;
} // :cond_a
return;
/* .line 22 */
} // :cond_b
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Trying to recycle an ignored view holder.You should first call stopIgnoringView(view) before calling recycle."; // const-string v1, "Trying to recycle an ignored view holder.You should first call stopIgnoringView(view) before calling recycle."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.i;
/* .line 23 */
(( androidx.recyclerview.widget.RecyclerView ) v1 ).n ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 24 */
} // :cond_c
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "; // const-string v2, "Tmp detached view should be removed from RecyclerView before it can be recycled: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
p1 = this.i;
/* .line 25 */
(( androidx.recyclerview.widget.RecyclerView ) p1 ).n ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 26 */
} // :cond_d
} // :goto_7
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Scrapped or attached views may not be recycled.isScrap:"; // const-string v4, "Scrapped or attached views may not be recycled.isScrap:"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 27 */
v4 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).s ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->s()Z
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v4 = " isAttached:"; // const-string v4, " isAttached:"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p1 = this.a;
/* .line 28 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
if ( p1 != null) { // if-eqz p1, :cond_e
int v1 = 1; // const/4 v1, 0x1
} // :cond_e
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
p1 = this.i;
(( androidx.recyclerview.widget.RecyclerView ) p1 ).n ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Integer e ( ) {
/* .locals 1 */
/* .line 10 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
} // .end method
public void e ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.c;
(( java.util.ArrayList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroidx/recyclerview/widget/RecyclerView$d0; */
int v1 = 1; // const/4 v1, 0x1
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$v;->a(Landroidx/recyclerview/widget/RecyclerView$d0;Z)V
/* .line 3 */
v0 = this.c;
(( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
return;
} // .end method
public void e ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 1 */
/* .line 4 */
/* iget-boolean v0, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->o:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 6 */
} // :cond_0
v0 = this.a;
(( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
this.n = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
/* iput-boolean v0, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->o:Z */
/* .line 9 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).c ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->c()V
return;
} // .end method
public java.util.List f ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Landroidx/recyclerview/widget/RecyclerView$d0;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 3 */
v0 = this.d;
} // .end method
public void f ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$v;->e:I */
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).j ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$v;->j()V
return;
} // .end method
public Boolean f ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 7 */
/* .line 4 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).r ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->r()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
p1 = this.i;
p1 = this.i0;
p1 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).d ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
/* .line 6 */
} // :cond_0
/* iget v0, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* if-ltz v0, :cond_4 */
v1 = this.i;
v1 = this.m;
v1 = (( androidx.recyclerview.widget.RecyclerView$g ) v1 ).a ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$g;->a()I
/* if-ge v0, v1, :cond_4 */
/* .line 7 */
v0 = this.i;
v0 = this.i0;
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) v0 ).d ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_1 */
/* .line 8 */
v0 = this.i;
v0 = this.m;
/* iget v2, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
v0 = (( androidx.recyclerview.widget.RecyclerView$g ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$g;->b(I)I
/* .line 9 */
v2 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).i ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->i()I
/* if-eq v0, v2, :cond_1 */
/* .line 10 */
} // :cond_1
v0 = this.i;
v0 = this.m;
v0 = (( androidx.recyclerview.widget.RecyclerView$g ) v0 ).b ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->b()Z
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 11 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).h ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->h()J
/* move-result-wide v3 */
v0 = this.i;
v0 = this.m;
/* iget p1, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
(( androidx.recyclerview.widget.RecyclerView$g ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->a(I)J
/* move-result-wide v5 */
/* cmp-long p1, v3, v5 */
/* if-nez p1, :cond_2 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
} // :cond_3
/* .line 12 */
} // :cond_4
/* new-instance v0, Ljava/lang/IndexOutOfBoundsException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Inconsistency detected.Invalid view holder adapter position"; // const-string v2, "Inconsistency detected.Invalid view holder adapter position"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
p1 = this.i;
/* .line 13 */
(( androidx.recyclerview.widget.RecyclerView ) p1 ).n ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void g ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 2 */
v2 = this.c;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroidx/recyclerview/widget/RecyclerView$d0; */
/* .line 3 */
v2 = this.a;
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroidx/recyclerview/widget/RecyclerView$p; */
if ( v2 != null) { // if-eqz v2, :cond_0
int v3 = 1; // const/4 v3, 0x1
/* .line 4 */
/* iput-boolean v3, v2, Landroidx/recyclerview/widget/RecyclerView$p;->c:Z */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public void h ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 2 */
v2 = this.c;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroidx/recyclerview/widget/RecyclerView$d0; */
if ( v2 != null) { // if-eqz v2, :cond_0
int v3 = 6; // const/4 v3, 0x6
/* .line 3 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(I)V
int v3 = 0; // const/4 v3, 0x0
/* .line 4 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(Ljava/lang/Object;)V
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* .line 5 */
} // :cond_1
v0 = this.i;
v0 = this.m;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( androidx.recyclerview.widget.RecyclerView$g ) v0 ).b ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->b()Z
/* if-nez v0, :cond_3 */
/* .line 6 */
} // :cond_2
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$v;->i()V
} // :cond_3
return;
} // .end method
public void i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->e(I)V
/* add-int/lit8 v0, v0, -0x1 */
/* .line 3 */
} // :cond_0
v0 = this.c;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 4 */
/* sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->D0:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
v0 = this.i;
v0 = this.h0;
(( c.r.d.u$a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/r/d/u$a;->a()V
} // :cond_1
return;
} // .end method
public void j ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.i;
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, v0, Landroidx/recyclerview/widget/RecyclerView$o;->l:I */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :goto_0
/* iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$v;->e:I */
/* add-int/2addr v1, v0 */
/* iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$v;->f:I */
/* .line 3 */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_1
/* if-ltz v0, :cond_1 */
/* .line 4 */
v1 = this.c;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$v;->f:I */
/* if-le v1, v2, :cond_1 */
/* .line 5 */
(( androidx.recyclerview.widget.RecyclerView$v ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->e(I)V
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
return;
} // .end method
