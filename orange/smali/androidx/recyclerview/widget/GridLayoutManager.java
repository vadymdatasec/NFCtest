public class androidx.recyclerview.widget.GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/recyclerview/widget/GridLayoutManager$b;, */
	 /* Landroidx/recyclerview/widget/GridLayoutManager$a;, */
	 /* Landroidx/recyclerview/widget/GridLayoutManager$c; */
	 /* } */
} // .end annotation
/* # instance fields */
public Boolean H;
public Integer I;
public J;
public android.view.View K;
public final android.util.SparseIntArray L;
public final android.util.SparseIntArray M;
public androidx.recyclerview.widget.GridLayoutManager$c N;
public final android.graphics.Rect O;
public Boolean P;
/* # direct methods */
public androidx.recyclerview.widget.GridLayoutManager ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->H:Z */
	 int v0 = -1; // const/4 v0, -0x1
	 /* .line 3 */
	 /* iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
	 /* .line 4 */
	 /* new-instance v0, Landroid/util/SparseIntArray; */
	 /* invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V */
	 this.L = v0;
	 /* .line 5 */
	 /* new-instance v0, Landroid/util/SparseIntArray; */
	 /* invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V */
	 this.M = v0;
	 /* .line 6 */
	 /* new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$a; */
	 /* invoke-direct {v0}, Landroidx/recyclerview/widget/GridLayoutManager$a;-><init>()V */
	 this.N = v0;
	 /* .line 7 */
	 /* new-instance v0, Landroid/graphics/Rect; */
	 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
	 this.O = v0;
	 /* .line 8 */
	 androidx.recyclerview.widget.RecyclerView$o .a ( p1,p2,p3,p4 );
	 /* .line 9 */
	 /* iget p1, p1, Landroidx/recyclerview/widget/RecyclerView$o$b;->b:I */
	 (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).m ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->m(I)V
	 return;
} // .end method
public static a ( Integer[] p0, Integer p1, Integer p2 ) {
	 /* .locals 5 */
	 int v0 = 1; // const/4 v0, 0x1
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 /* .line 40 */
		 /* array-length v1, p0 */
		 /* add-int/lit8 v2, p1, 0x1 */
		 /* if-ne v1, v2, :cond_0 */
		 /* array-length v1, p0 */
		 /* sub-int/2addr v1, v0 */
		 /* aget v1, p0, v1 */
		 /* if-eq v1, p2, :cond_1 */
	 } // :cond_0
	 /* add-int/lit8 p0, p1, 0x1 */
	 /* .line 41 */
	 /* new-array p0, p0, [I */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 42 */
/* aput v1, p0, v1 */
/* .line 43 */
/* div-int v2, p2, p1 */
/* .line 44 */
/* rem-int/2addr p2, p1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-gt v0, p1, :cond_3 */
/* add-int/2addr v1, p2 */
/* if-lez v1, :cond_2 */
/* sub-int v4, p1, v1 */
/* if-ge v4, p2, :cond_2 */
/* add-int/lit8 v4, v2, 0x1 */
/* sub-int/2addr v1, p1 */
} // :cond_2
/* move v4, v2 */
} // :goto_1
/* add-int/2addr v3, v4 */
/* .line 45 */
/* aput v3, p0, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
} // .end method
/* # virtual methods */
public Boolean C ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.C;
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->H:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final void S ( ) {
/* .locals 6 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* .line 3 */
v3 = (( androidx.recyclerview.widget.RecyclerView$p ) v2 ).a ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I
/* .line 4 */
v4 = this.L;
v5 = (( androidx.recyclerview.widget.GridLayoutManager$b ) v2 ).f ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/GridLayoutManager$b;->f()I
(( android.util.SparseIntArray ) v4 ).put ( v3, v5 ); // invoke-virtual {v4, v3, v5}, Landroid/util/SparseIntArray;->put(II)V
/* .line 5 */
v4 = this.M;
v2 = (( androidx.recyclerview.widget.GridLayoutManager$b ) v2 ).e ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/GridLayoutManager$b;->e()I
(( android.util.SparseIntArray ) v4 ).put ( v3, v2 ); // invoke-virtual {v4, v3, v2}, Landroid/util/SparseIntArray;->put(II)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public final void T ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.L;
(( android.util.SparseIntArray ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V
/* .line 2 */
v0 = this.M;
(( android.util.SparseIntArray ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V
return;
} // .end method
public final void U ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.K;
if ( v0 != null) { // if-eqz v0, :cond_0
/* array-length v0, v0 */
/* iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* if-eq v0, v1, :cond_1 */
/* .line 2 */
} // :cond_0
/* iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* new-array v0, v0, [Landroid/view/View; */
this.K = v0;
} // :cond_1
return;
} // .end method
public final void V ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.LinearLayoutManager ) p0 ).N ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->N()I
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 2 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->q()I
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->o()I
/* sub-int/2addr v0, v1 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I
/* .line 3 */
} // :cond_0
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h()I
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->m()I
/* sub-int/2addr v0, v1 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->p()I
} // :goto_0
/* sub-int/2addr v0, v1 */
/* .line 4 */
(( androidx.recyclerview.widget.GridLayoutManager ) p0 ).l ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->l(I)V
return;
} // .end method
public Integer a ( Integer p0, androidx.recyclerview.widget.RecyclerView$v p1, androidx.recyclerview.widget.RecyclerView$a0 p2 ) {
/* .locals 0 */
/* .line 51 */
(( androidx.recyclerview.widget.GridLayoutManager ) p0 ).V ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->V()V
/* .line 52 */
(( androidx.recyclerview.widget.GridLayoutManager ) p0 ).U ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->U()V
/* .line 53 */
p1 = /* invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->a(ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I */
} // .end method
public Integer a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 2 */
/* iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* .line 3 */
} // :cond_0
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).a ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* if-ge v0, v1, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
} // :cond_1
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).a ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* sub-int/2addr v0, v1 */
p1 = (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
/* add-int/2addr p1, v1 */
} // .end method
public final Integer a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, Integer p2 ) {
/* .locals 0 */
/* .line 63 */
p2 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).d ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
/* if-nez p2, :cond_0 */
/* .line 64 */
p1 = this.N;
/* iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
p1 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).a ( p3, p2 ); // invoke-virtual {p1, p3, p2}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(II)I
/* .line 65 */
} // :cond_0
p1 = (( androidx.recyclerview.widget.RecyclerView$v ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$v;->a(I)I
int p2 = -1; // const/4 p2, -0x1
/* if-ne p1, p2, :cond_1 */
/* .line 66 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String p2 = "Cannot find span size for pre layout position."; // const-string p2, "Cannot find span size for pre layout position."
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p2 = "GridLayoutManager"; // const-string p2, "GridLayoutManager"
android.util.Log .w ( p2,p1 );
int p1 = 0; // const/4 p1, 0x0
/* .line 67 */
} // :cond_1
p2 = this.N;
/* iget p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
p1 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p2 ).a ( p1, p3 ); // invoke-virtual {p2, p1, p3}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(II)I
} // .end method
public android.view.View a ( android.view.View p0, Integer p1, androidx.recyclerview.widget.RecyclerView$v p2, androidx.recyclerview.widget.RecyclerView$a0 p3 ) {
/* .locals 23 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p3 */
/* move-object/from16 v2, p4 */
/* .line 151 */
/* invoke-virtual/range {p0 ..p1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(Landroid/view/View;)Landroid/view/View; */
int v4 = 0; // const/4 v4, 0x0
/* if-nez v3, :cond_0 */
/* .line 152 */
} // :cond_0
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* .line 153 */
/* iget v6, v5, Landroidx/recyclerview/widget/GridLayoutManager$b;->e:I */
/* .line 154 */
/* iget v5, v5, Landroidx/recyclerview/widget/GridLayoutManager$b;->f:I */
/* add-int/2addr v5, v6 */
/* .line 155 */
/* invoke-super/range {p0 ..p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->a(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)Landroid/view/View; */
/* if-nez v7, :cond_1 */
} // :cond_1
/* move/from16 v7, p2 */
/* .line 156 */
v7 = (( androidx.recyclerview.widget.LinearLayoutManager ) v0 ).h ( v7 ); // invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;->h(I)I
int v9 = 1; // const/4 v9, 0x1
/* if-ne v7, v9, :cond_2 */
int v7 = 1; // const/4 v7, 0x1
} // :cond_2
int v7 = 0; // const/4 v7, 0x0
/* .line 157 */
} // :goto_0
/* iget-boolean v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z */
/* if-eq v7, v10, :cond_3 */
int v7 = 1; // const/4 v7, 0x1
} // :cond_3
int v7 = 0; // const/4 v7, 0x0
} // :goto_1
int v10 = -1; // const/4 v10, -0x1
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 158 */
v7 = /* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I */
/* sub-int/2addr v7, v9 */
int v11 = -1; // const/4 v11, -0x1
int v12 = -1; // const/4 v12, -0x1
/* .line 159 */
} // :cond_4
v7 = /* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I */
/* move v11, v7 */
int v7 = 0; // const/4 v7, 0x0
int v12 = 1; // const/4 v12, 0x1
/* .line 160 */
} // :goto_2
/* iget v13, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:I */
/* if-ne v13, v9, :cond_5 */
v13 = /* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->O()Z */
if ( v13 != null) { // if-eqz v13, :cond_5
int v13 = 1; // const/4 v13, 0x1
} // :cond_5
int v13 = 0; // const/4 v13, 0x0
/* .line 161 */
} // :goto_3
v14 = (( androidx.recyclerview.widget.GridLayoutManager ) v0 ).a ( v1, v2, v7 ); // invoke-virtual {v0, v1, v2, v7}, Landroidx/recyclerview/widget/GridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
/* move v10, v7 */
int v8 = 0; // const/4 v8, 0x0
int v15 = -1; // const/4 v15, -0x1
/* const/16 v16, -0x1 */
/* const/16 v17, 0x0 */
/* move-object v7, v4 */
} // :goto_4
/* if-eq v10, v11, :cond_18 */
/* .line 162 */
v9 = (( androidx.recyclerview.widget.GridLayoutManager ) v0 ).a ( v1, v2, v10 ); // invoke-virtual {v0, v1, v2, v10}, Landroidx/recyclerview/widget/GridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
/* .line 163 */
(( androidx.recyclerview.widget.RecyclerView$o ) v0 ).c ( v10 ); // invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* if-ne v1, v3, :cond_6 */
/* goto/16 :goto_e */
/* .line 164 */
} // :cond_6
v18 = (( android.view.View ) v1 ).hasFocusable ( ); // invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z
if ( v18 != null) { // if-eqz v18, :cond_8
/* if-eq v9, v14, :cond_8 */
if ( v4 != null) { // if-eqz v4, :cond_7
/* goto/16 :goto_e */
} // :cond_7
/* move-object/from16 v18, v3 */
/* move-object/from16 v21, v7 */
/* move/from16 v19, v8 */
/* move/from16 v20, v11 */
/* move/from16 v7, v16 */
/* move/from16 v8, v17 */
/* goto/16 :goto_c */
/* .line 165 */
} // :cond_8
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v9, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* .line 166 */
/* iget v2, v9, Landroidx/recyclerview/widget/GridLayoutManager$b;->e:I */
/* move-object/from16 v18, v3 */
/* .line 167 */
/* iget v3, v9, Landroidx/recyclerview/widget/GridLayoutManager$b;->f:I */
/* add-int/2addr v3, v2 */
/* .line 168 */
v19 = (( android.view.View ) v1 ).hasFocusable ( ); // invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z
if ( v19 != null) { // if-eqz v19, :cond_9
/* if-ne v2, v6, :cond_9 */
/* if-ne v3, v5, :cond_9 */
/* .line 169 */
} // :cond_9
v19 = (( android.view.View ) v1 ).hasFocusable ( ); // invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z
if ( v19 != null) { // if-eqz v19, :cond_a
if ( v4 != null) { // if-eqz v4, :cond_b
/* .line 170 */
} // :cond_a
v19 = (( android.view.View ) v1 ).hasFocusable ( ); // invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z
/* if-nez v19, :cond_c */
/* if-nez v7, :cond_c */
} // :cond_b
/* move-object/from16 v21, v7 */
} // :goto_5
/* move/from16 v19, v8 */
/* move/from16 v20, v11 */
/* move/from16 v7, v16 */
/* move/from16 v8, v17 */
} // :goto_6
int v11 = 1; // const/4 v11, 0x1
/* .line 171 */
} // :cond_c
v19 = java.lang.Math .max ( v2,v6 );
/* .line 172 */
v20 = java.lang.Math .min ( v3,v5 );
/* move-object/from16 v21, v7 */
/* sub-int v7, v20, v19 */
/* .line 173 */
v19 = (( android.view.View ) v1 ).hasFocusable ( ); // invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z
if ( v19 != null) { // if-eqz v19, :cond_f
/* if-le v7, v8, :cond_d */
} // :goto_7
} // :cond_d
/* if-ne v7, v8, :cond_13 */
/* if-le v2, v15, :cond_e */
int v7 = 1; // const/4 v7, 0x1
} // :cond_e
int v7 = 0; // const/4 v7, 0x0
} // :goto_8
/* if-ne v13, v7, :cond_13 */
} // :cond_f
/* if-nez v4, :cond_13 */
/* move/from16 v19, v8 */
/* move/from16 v20, v11 */
int v8 = 0; // const/4 v8, 0x0
int v11 = 1; // const/4 v11, 0x1
/* .line 174 */
v22 = (( androidx.recyclerview.widget.RecyclerView$o ) v0 ).a ( v1, v8, v11 ); // invoke-virtual {v0, v1, v8, v11}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;ZZ)Z
if ( v22 != null) { // if-eqz v22, :cond_14
/* move/from16 v8, v17 */
/* if-le v7, v8, :cond_10 */
/* move/from16 v7, v16 */
} // :cond_10
/* if-ne v7, v8, :cond_12 */
/* move/from16 v7, v16 */
/* if-le v2, v7, :cond_11 */
} // :cond_11
int v11 = 0; // const/4 v11, 0x0
} // :goto_9
/* if-ne v13, v11, :cond_15 */
} // :cond_12
/* move/from16 v7, v16 */
} // :cond_13
/* move/from16 v19, v8 */
/* move/from16 v20, v11 */
} // :cond_14
/* move/from16 v7, v16 */
/* move/from16 v8, v17 */
} // :cond_15
} // :goto_a
int v11 = 0; // const/4 v11, 0x0
} // :goto_b
if ( v11 != null) { // if-eqz v11, :cond_17
/* .line 175 */
v11 = (( android.view.View ) v1 ).hasFocusable ( ); // invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z
if ( v11 != null) { // if-eqz v11, :cond_16
/* .line 176 */
/* iget v4, v9, Landroidx/recyclerview/widget/GridLayoutManager$b;->e:I */
/* .line 177 */
v3 = java.lang.Math .min ( v3,v5 );
/* .line 178 */
v2 = java.lang.Math .max ( v2,v6 );
/* sub-int v2, v3, v2 */
/* move v15, v4 */
/* move/from16 v16, v7 */
/* move/from16 v17, v8 */
/* move-object/from16 v7, v21 */
/* move-object v4, v1 */
/* move v8, v2 */
/* .line 179 */
} // :cond_16
/* iget v7, v9, Landroidx/recyclerview/widget/GridLayoutManager$b;->e:I */
/* .line 180 */
v3 = java.lang.Math .min ( v3,v5 );
/* .line 181 */
v2 = java.lang.Math .max ( v2,v6 );
/* sub-int v17, v3, v2 */
/* move/from16 v16, v7 */
/* move/from16 v8, v19 */
/* move-object v7, v1 */
} // :cond_17
} // :goto_c
/* move/from16 v16, v7 */
/* move/from16 v17, v8 */
/* move/from16 v8, v19 */
/* move-object/from16 v7, v21 */
} // :goto_d
/* add-int/2addr v10, v12 */
/* move-object/from16 v1, p3 */
/* move-object/from16 v2, p4 */
/* move-object/from16 v3, v18 */
/* move/from16 v11, v20 */
int v9 = 1; // const/4 v9, 0x1
/* goto/16 :goto_4 */
} // :cond_18
} // :goto_e
/* move-object/from16 v21, v7 */
if ( v4 != null) { // if-eqz v4, :cond_19
} // :cond_19
/* move-object/from16 v4, v21 */
} // :goto_f
} // .end method
public android.view.View a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 7 */
/* .line 54 */
(( androidx.recyclerview.widget.LinearLayoutManager ) p0 ).E ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->E()V
/* .line 55 */
v0 = this.t;
v0 = (( c.r.d.c0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/r/d/c0;->f()I
/* .line 56 */
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).b ( ); // invoke-virtual {v1}, Lc/r/d/c0;->b()I
/* if-le p4, p3, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = -1; // const/4 v2, -0x1
} // :goto_0
int v3 = 0; // const/4 v3, 0x0
/* move-object v4, v3 */
} // :goto_1
/* if-eq p3, p4, :cond_6 */
/* .line 57 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( p3 ); // invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 58 */
v6 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v5 ); // invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* if-ltz v6, :cond_5 */
/* if-ge v6, p5, :cond_5 */
/* .line 59 */
v6 = (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).b ( p1, p2, v6 ); // invoke-virtual {p0, p1, p2, v6}, Landroidx/recyclerview/widget/GridLayoutManager;->b(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 60 */
} // :cond_1
(( android.view.View ) v5 ).getLayoutParams ( ); // invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v6, Landroidx/recyclerview/widget/RecyclerView$p; */
v6 = (( androidx.recyclerview.widget.RecyclerView$p ) v6 ).c ( ); // invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$p;->c()Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* if-nez v4, :cond_5 */
/* move-object v4, v5 */
/* .line 61 */
} // :cond_2
v6 = this.t;
v6 = (( c.r.d.c0 ) v6 ).d ( v5 ); // invoke-virtual {v6, v5}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* if-ge v6, v1, :cond_4 */
v6 = this.t;
/* .line 62 */
v6 = (( c.r.d.c0 ) v6 ).a ( v5 ); // invoke-virtual {v6, v5}, Lc/r/d/c0;->a(Landroid/view/View;)I
/* if-ge v6, v0, :cond_3 */
} // :cond_3
} // :cond_4
} // :goto_2
/* if-nez v3, :cond_5 */
/* move-object v3, v5 */
} // :cond_5
} // :goto_3
/* add-int/2addr p3, v2 */
} // :cond_6
if ( v3 != null) { // if-eqz v3, :cond_7
} // :cond_7
/* move-object v3, v4 */
} // :goto_4
} // .end method
public androidx.recyclerview.widget.RecyclerView$p a ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 19 */
/* new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public androidx.recyclerview.widget.RecyclerView$p a ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* .line 20 */
/* instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 21 */
/* new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams; */
/* invoke-direct {v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$b;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
/* .line 22 */
} // :cond_0
/* new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* invoke-direct {v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$b;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
public final void a ( Float p0, Integer p1 ) {
/* .locals 1 */
/* .line 141 */
/* iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* int-to-float v0, v0 */
/* mul-float p1, p1, v0 */
p1 = java.lang.Math .round ( p1 );
/* .line 142 */
p1 = java.lang.Math .max ( p1,p2 );
(( androidx.recyclerview.widget.GridLayoutManager ) p0 ).l ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->l(I)V
return;
} // .end method
public void a ( android.graphics.Rect p0, Integer p1, Integer p2 ) {
/* .locals 4 */
/* .line 24 */
v0 = this.J;
/* if-nez v0, :cond_0 */
/* .line 25 */
/* invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/graphics/Rect;II)V */
/* .line 26 */
} // :cond_0
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->o()I
/* add-int/2addr v0, v1 */
/* .line 27 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->p()I
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->m()I
/* add-int/2addr v1, v2 */
/* .line 28 */
/* iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:I */
int v3 = 1; // const/4 v3, 0x1
/* if-ne v2, v3, :cond_1 */
/* .line 29 */
p1 = (( android.graphics.Rect ) p1 ).height ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->height()I
/* add-int/2addr p1, v1 */
/* .line 30 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).k ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->k()I
p1 = androidx.recyclerview.widget.RecyclerView$o .a ( p3,p1,v1 );
/* .line 31 */
p3 = this.J;
/* array-length v1, p3 */
/* sub-int/2addr v1, v3 */
/* aget p3, p3, v1 */
/* add-int/2addr p3, v0 */
/* .line 32 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->l()I
/* .line 33 */
p2 = androidx.recyclerview.widget.RecyclerView$o .a ( p2,p3,v0 );
/* .line 34 */
} // :cond_1
p1 = (( android.graphics.Rect ) p1 ).width ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->width()I
/* add-int/2addr p1, v0 */
/* .line 35 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->l()I
p2 = androidx.recyclerview.widget.RecyclerView$o .a ( p2,p1,v0 );
/* .line 36 */
p1 = this.J;
/* array-length v0, p1 */
/* sub-int/2addr v0, v3 */
/* aget p1, p1, v0 */
/* add-int/2addr p1, v1 */
/* .line 37 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).k ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->k()I
/* .line 38 */
p1 = androidx.recyclerview.widget.RecyclerView$o .a ( p3,p1,v0 );
/* .line 39 */
} // :goto_0
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(II)V
return;
} // .end method
public final void a ( android.view.View p0, Integer p1, Integer p2, Boolean p3 ) {
/* .locals 1 */
/* .line 143 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/recyclerview/widget/RecyclerView$p; */
if ( p4 != null) { // if-eqz p4, :cond_0
/* .line 144 */
p4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$p;)Z
/* .line 145 */
} // :cond_0
p4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$p;)Z
} // :goto_0
if ( p4 != null) { // if-eqz p4, :cond_1
/* .line 146 */
(( android.view.View ) p1 ).measure ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V
} // :cond_1
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$a0 p0, androidx.recyclerview.widget.LinearLayoutManager$c p1, androidx.recyclerview.widget.RecyclerView$o$a p2 ) {
/* .locals 5 */
/* .line 68 */
/* iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* .line 69 */
} // :goto_0
/* iget v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* if-ge v2, v3, :cond_0 */
v3 = (( androidx.recyclerview.widget.LinearLayoutManager$c ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/LinearLayoutManager$c;->a(Landroidx/recyclerview/widget/RecyclerView$a0;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* if-lez v0, :cond_0 */
/* .line 70 */
/* iget v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
/* .line 71 */
/* iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I */
v4 = java.lang.Math .max ( v1,v4 );
/* .line 72 */
v4 = this.N;
v3 = (( androidx.recyclerview.widget.GridLayoutManager$c ) v4 ).a ( v3 ); // invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(I)I
/* sub-int/2addr v0, v3 */
/* .line 73 */
/* iget v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
/* iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I */
/* add-int/2addr v3, v4 */
/* iput v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
return;
} // .end method
public final void a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, Integer p2, Boolean p3 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
int v1 = -1; // const/4 v1, -0x1
if ( p4 != null) { // if-eqz p4, :cond_0
int v1 = 1; // const/4 v1, 0x1
/* move v1, p3 */
int p3 = 0; // const/4 p3, 0x0
int p4 = 1; // const/4 p4, 0x1
} // :cond_0
/* add-int/lit8 p3, p3, -0x1 */
int p4 = -1; // const/4 p4, -0x1
} // :goto_0
/* if-eq p3, v1, :cond_1 */
/* .line 147 */
v2 = this.K;
/* aget-object v2, v2, p3 */
/* .line 148 */
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* .line 149 */
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v2 ); // invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
v2 = (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).c ( p1, p2, v2 ); // invoke-virtual {p0, p1, p2, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->c(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
/* iput v2, v3, Landroidx/recyclerview/widget/GridLayoutManager$b;->f:I */
/* .line 150 */
/* iput v0, v3, Landroidx/recyclerview/widget/GridLayoutManager$b;->e:I */
/* add-int/2addr v0, v2 */
/* add-int/2addr p3, p4 */
} // :cond_1
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, android.view.View p2, Object p3 ) {
/* .locals 7 */
/* .line 5 */
(( android.view.View ) p3 ).getLayoutParams ( ); // invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 6 */
/* instance-of v1, v0, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* if-nez v1, :cond_0 */
/* .line 7 */
/* invoke-super {p0, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;Lc/h/n/v1/h;)V */
return;
/* .line 8 */
} // :cond_0
/* check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* .line 9 */
p3 = (( androidx.recyclerview.widget.RecyclerView$p ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I
p1 = (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
/* .line 10 */
/* iget p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:I */
/* if-nez p2, :cond_1 */
/* .line 11 */
v1 = (( androidx.recyclerview.widget.GridLayoutManager$b ) v0 ).e ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager$b;->e()I
v2 = (( androidx.recyclerview.widget.GridLayoutManager$b ) v0 ).f ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager$b;->f()I
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move v3, p1 */
/* .line 12 */
/* invoke-static/range {v1 ..v6}, Lc/h/n/v1/h$a;->a(IIIIZZ)Lc/h/n/v1/h$a; */
(( c.h.n.v1.h ) p4 ).b ( p1 ); // invoke-virtual {p4, p1}, Lc/h/n/v1/h;->b(Ljava/lang/Object;)V
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
/* .line 13 */
v3 = (( androidx.recyclerview.widget.GridLayoutManager$b ) v0 ).e ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager$b;->e()I
v4 = (( androidx.recyclerview.widget.GridLayoutManager$b ) v0 ).f ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager$b;->f()I
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move v1, p1 */
/* .line 14 */
/* invoke-static/range {v1 ..v6}, Lc/h/n/v1/h$a;->a(IIIIZZ)Lc/h/n/v1/h$a; */
(( c.h.n.v1.h ) p4 ).b ( p1 ); // invoke-virtual {p4, p1}, Lc/h/n/v1/h;->b(Ljava/lang/Object;)V
} // :goto_0
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, androidx.recyclerview.widget.LinearLayoutManager$a p2, Integer p3 ) {
/* .locals 1 */
/* .line 46 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Landroidx/recyclerview/widget/LinearLayoutManager$a;I)V */
/* .line 47 */
(( androidx.recyclerview.widget.GridLayoutManager ) p0 ).V ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->V()V
/* .line 48 */
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).a ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* if-lez v0, :cond_0 */
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).d ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
/* if-nez v0, :cond_0 */
/* .line 49 */
(( androidx.recyclerview.widget.GridLayoutManager ) p0 ).b ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/GridLayoutManager;->b(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Landroidx/recyclerview/widget/LinearLayoutManager$a;I)V
/* .line 50 */
} // :cond_0
(( androidx.recyclerview.widget.GridLayoutManager ) p0 ).U ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->U()V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, androidx.recyclerview.widget.LinearLayoutManager$c p2, androidx.recyclerview.widget.LinearLayoutManager$b p3 ) {
/* .locals 17 */
/* move-object/from16 v6, p0 */
/* move-object/from16 v0, p1 */
/* move-object/from16 v1, p2 */
/* move-object/from16 v2, p3 */
/* move-object/from16 v7, p4 */
/* .line 74 */
v3 = this.t;
v3 = (( c.r.d.c0 ) v3 ).e ( ); // invoke-virtual {v3}, Lc/r/d/c0;->e()I
/* const/high16 v4, 0x40000000 # 2.0f */
int v8 = 1; // const/4 v8, 0x1
int v5 = 0; // const/4 v5, 0x0
/* if-eq v3, v4, :cond_0 */
int v9 = 1; // const/4 v9, 0x1
} // :cond_0
int v9 = 0; // const/4 v9, 0x0
/* .line 75 */
} // :goto_0
v10 = /* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I */
/* if-lez v10, :cond_1 */
v10 = this.J;
/* iget v11, v6, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* aget v10, v10, v11 */
} // :cond_1
int v10 = 0; // const/4 v10, 0x0
} // :goto_1
if ( v9 != null) { // if-eqz v9, :cond_2
/* .line 76 */
/* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/GridLayoutManager;->V()V */
/* .line 77 */
} // :cond_2
/* iget v11, v2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I */
/* if-ne v11, v8, :cond_3 */
int v11 = 1; // const/4 v11, 0x1
} // :cond_3
int v11 = 0; // const/4 v11, 0x0
/* .line 78 */
} // :goto_2
/* iget v12, v6, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* if-nez v11, :cond_4 */
/* .line 79 */
/* iget v12, v2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
v12 = (( androidx.recyclerview.widget.GridLayoutManager ) v6 ).b ( v0, v1, v12 ); // invoke-virtual {v6, v0, v1, v12}, Landroidx/recyclerview/widget/GridLayoutManager;->b(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
/* .line 80 */
/* iget v13, v2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
v13 = (( androidx.recyclerview.widget.GridLayoutManager ) v6 ).c ( v0, v1, v13 ); // invoke-virtual {v6, v0, v1, v13}, Landroidx/recyclerview/widget/GridLayoutManager;->c(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
/* add-int/2addr v12, v13 */
} // :cond_4
int v13 = 0; // const/4 v13, 0x0
/* .line 81 */
} // :goto_3
/* iget v14, v6, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* if-ge v13, v14, :cond_8 */
v14 = (( androidx.recyclerview.widget.LinearLayoutManager$c ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager$c;->a(Landroidx/recyclerview/widget/RecyclerView$a0;)Z
if ( v14 != null) { // if-eqz v14, :cond_8
/* if-lez v12, :cond_8 */
/* .line 82 */
/* iget v14, v2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
/* .line 83 */
v15 = (( androidx.recyclerview.widget.GridLayoutManager ) v6 ).c ( v0, v1, v14 ); // invoke-virtual {v6, v0, v1, v14}, Landroidx/recyclerview/widget/GridLayoutManager;->c(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
/* .line 84 */
/* iget v4, v6, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* if-gt v15, v4, :cond_7 */
/* sub-int/2addr v12, v15 */
/* if-gez v12, :cond_5 */
/* .line 85 */
} // :cond_5
(( androidx.recyclerview.widget.LinearLayoutManager$c ) v2 ).a ( v0 ); // invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager$c;->a(Landroidx/recyclerview/widget/RecyclerView$v;)Landroid/view/View;
/* if-nez v4, :cond_6 */
/* .line 86 */
} // :cond_6
v14 = this.K;
/* aput-object v4, v14, v13 */
/* add-int/lit8 v13, v13, 0x1 */
/* const/high16 v4, 0x40000000 # 2.0f */
/* .line 87 */
} // :cond_7
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Item at position "; // const-string v2, "Item at position "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v14 ); // invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " requires "; // const-string v2, " requires "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v15 ); // invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " spans but GridLayoutManager has only "; // const-string v2, " spans but GridLayoutManager has only "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, v6, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " spans."; // const-string v2, " spans."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_8
} // :goto_4
/* if-nez v13, :cond_9 */
/* .line 88 */
/* iput-boolean v8, v7, Landroidx/recyclerview/widget/LinearLayoutManager$b;->b:Z */
return;
} // :cond_9
int v4 = 0; // const/4 v4, 0x0
/* .line 89 */
(( androidx.recyclerview.widget.GridLayoutManager ) v6 ).a ( v0, v1, v13, v11 ); // invoke-virtual {v6, v0, v1, v13, v11}, Landroidx/recyclerview/widget/GridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;IZ)V
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
} // :goto_5
/* if-ge v0, v13, :cond_f */
/* .line 90 */
v12 = this.K;
/* aget-object v12, v12, v0 */
/* .line 91 */
v14 = this.l;
/* if-nez v14, :cond_b */
if ( v11 != null) { // if-eqz v11, :cond_a
/* .line 92 */
(( androidx.recyclerview.widget.RecyclerView$o ) v6 ).b ( v12 ); // invoke-virtual {v6, v12}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroid/view/View;)V
/* .line 93 */
} // :cond_a
(( androidx.recyclerview.widget.RecyclerView$o ) v6 ).b ( v12, v5 ); // invoke-virtual {v6, v12, v5}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroid/view/View;I)V
} // :cond_b
if ( v11 != null) { // if-eqz v11, :cond_c
/* .line 94 */
(( androidx.recyclerview.widget.RecyclerView$o ) v6 ).a ( v12 ); // invoke-virtual {v6, v12}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;)V
/* .line 95 */
} // :cond_c
(( androidx.recyclerview.widget.RecyclerView$o ) v6 ).a ( v12, v5 ); // invoke-virtual {v6, v12, v5}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;I)V
/* .line 96 */
} // :goto_6
v14 = this.O;
(( androidx.recyclerview.widget.RecyclerView$o ) v6 ).a ( v12, v14 ); // invoke-virtual {v6, v12, v14}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;Landroid/graphics/Rect;)V
/* .line 97 */
(( androidx.recyclerview.widget.GridLayoutManager ) v6 ).b ( v12, v3, v5 ); // invoke-virtual {v6, v12, v3, v5}, Landroidx/recyclerview/widget/GridLayoutManager;->b(Landroid/view/View;IZ)V
/* .line 98 */
v14 = this.t;
v14 = (( c.r.d.c0 ) v14 ).b ( v12 ); // invoke-virtual {v14, v12}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* if-le v14, v1, :cond_d */
/* move v1, v14 */
/* .line 99 */
} // :cond_d
(( android.view.View ) v12 ).getLayoutParams ( ); // invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v14, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* const/high16 v15, 0x3f800000 # 1.0f */
/* .line 100 */
v5 = this.t;
v5 = (( c.r.d.c0 ) v5 ).c ( v12 ); // invoke-virtual {v5, v12}, Lc/r/d/c0;->c(Landroid/view/View;)I
/* int-to-float v5, v5 */
/* mul-float v5, v5, v15 */
/* iget v12, v14, Landroidx/recyclerview/widget/GridLayoutManager$b;->f:I */
/* int-to-float v12, v12 */
/* div-float/2addr v5, v12 */
/* cmpl-float v12, v5, v4 */
/* if-lez v12, :cond_e */
/* move v4, v5 */
} // :cond_e
/* add-int/lit8 v0, v0, 0x1 */
int v5 = 0; // const/4 v5, 0x0
} // :cond_f
if ( v9 != null) { // if-eqz v9, :cond_11
/* .line 101 */
(( androidx.recyclerview.widget.GridLayoutManager ) v6 ).a ( v4, v10 ); // invoke-virtual {v6, v4, v10}, Landroidx/recyclerview/widget/GridLayoutManager;->a(FI)V
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
} // :goto_7
/* if-ge v0, v13, :cond_11 */
/* .line 102 */
v3 = this.K;
/* aget-object v3, v3, v0 */
/* const/high16 v4, 0x40000000 # 2.0f */
/* .line 103 */
(( androidx.recyclerview.widget.GridLayoutManager ) v6 ).b ( v3, v4, v8 ); // invoke-virtual {v6, v3, v4, v8}, Landroidx/recyclerview/widget/GridLayoutManager;->b(Landroid/view/View;IZ)V
/* .line 104 */
v4 = this.t;
v3 = (( c.r.d.c0 ) v4 ).b ( v3 ); // invoke-virtual {v4, v3}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* if-le v3, v1, :cond_10 */
/* move v1, v3 */
} // :cond_10
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_11
int v0 = 0; // const/4 v0, 0x0
} // :goto_8
/* if-ge v0, v13, :cond_14 */
/* .line 105 */
v3 = this.K;
/* aget-object v3, v3, v0 */
/* .line 106 */
v4 = this.t;
v4 = (( c.r.d.c0 ) v4 ).b ( v3 ); // invoke-virtual {v4, v3}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* if-eq v4, v1, :cond_13 */
/* .line 107 */
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* .line 108 */
v5 = this.b;
/* .line 109 */
/* iget v9, v5, Landroid/graphics/Rect;->top:I */
/* iget v10, v5, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr v9, v10 */
/* iget v10, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v9, v10 */
/* iget v10, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v9, v10 */
/* .line 110 */
/* iget v10, v5, Landroid/graphics/Rect;->left:I */
/* iget v5, v5, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v10, v5 */
/* iget v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v10, v5 */
/* iget v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v10, v5 */
/* .line 111 */
/* iget v5, v4, Landroidx/recyclerview/widget/GridLayoutManager$b;->e:I */
/* iget v11, v4, Landroidx/recyclerview/widget/GridLayoutManager$b;->f:I */
v5 = (( androidx.recyclerview.widget.GridLayoutManager ) v6 ).h ( v5, v11 ); // invoke-virtual {v6, v5, v11}, Landroidx/recyclerview/widget/GridLayoutManager;->h(II)I
/* .line 112 */
/* iget v11, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:I */
/* if-ne v11, v8, :cond_12 */
/* .line 113 */
/* iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* const/high16 v11, 0x40000000 # 2.0f */
int v12 = 0; // const/4 v12, 0x0
v4 = androidx.recyclerview.widget.RecyclerView$o .a ( v5,v11,v10,v4,v12 );
/* sub-int v5, v1, v9 */
/* .line 114 */
v5 = android.view.View$MeasureSpec .makeMeasureSpec ( v5,v11 );
} // :cond_12
/* const/high16 v11, 0x40000000 # 2.0f */
int v12 = 0; // const/4 v12, 0x0
/* sub-int v10, v1, v10 */
/* .line 115 */
v10 = android.view.View$MeasureSpec .makeMeasureSpec ( v10,v11 );
/* .line 116 */
/* iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
v5 = androidx.recyclerview.widget.RecyclerView$o .a ( v5,v11,v9,v4,v12 );
/* move v4, v10 */
/* .line 117 */
} // :goto_9
(( androidx.recyclerview.widget.GridLayoutManager ) v6 ).a ( v3, v4, v5, v8 ); // invoke-virtual {v6, v3, v4, v5, v8}, Landroidx/recyclerview/widget/GridLayoutManager;->a(Landroid/view/View;IIZ)V
} // :cond_13
/* const/high16 v11, 0x40000000 # 2.0f */
int v12 = 0; // const/4 v12, 0x0
} // :goto_a
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_14
int v12 = 0; // const/4 v12, 0x0
/* .line 118 */
/* iput v1, v7, Landroidx/recyclerview/widget/LinearLayoutManager$b;->a:I */
/* .line 119 */
/* iget v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:I */
int v3 = -1; // const/4 v3, -0x1
/* if-ne v0, v8, :cond_16 */
/* .line 120 */
/* iget v0, v2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I */
/* if-ne v0, v3, :cond_15 */
/* .line 121 */
/* iget v0, v2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I */
/* sub-int v1, v0, v1 */
/* move v2, v1 */
/* .line 122 */
} // :cond_15
/* iget v0, v2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I */
/* add-int/2addr v1, v0 */
/* move v2, v0 */
/* move v0, v1 */
} // :goto_b
int v1 = 0; // const/4 v1, 0x0
int v3 = 0; // const/4 v3, 0x0
/* .line 123 */
} // :cond_16
/* iget v0, v2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I */
/* if-ne v0, v3, :cond_17 */
/* .line 124 */
/* iget v0, v2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I */
/* sub-int v1, v0, v1 */
/* move v3, v1 */
int v2 = 0; // const/4 v2, 0x0
/* move v1, v0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 125 */
} // :cond_17
/* iget v0, v2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I */
/* add-int/2addr v1, v0 */
/* move v3, v0 */
int v0 = 0; // const/4 v0, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_c
/* if-ge v12, v13, :cond_1c */
/* .line 126 */
v4 = this.K;
/* aget-object v9, v4, v12 */
/* .line 127 */
(( android.view.View ) v9 ).getLayoutParams ( ); // invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v10, v4 */
/* check-cast v10, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* .line 128 */
/* iget v4, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->r:I */
/* if-ne v4, v8, :cond_19 */
/* .line 129 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->O()Z */
if ( v1 != null) { // if-eqz v1, :cond_18
/* .line 130 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I */
v3 = this.J;
/* iget v4, v6, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* iget v5, v10, Landroidx/recyclerview/widget/GridLayoutManager$b;->e:I */
/* sub-int/2addr v4, v5 */
/* aget v3, v3, v4 */
/* add-int/2addr v1, v3 */
/* .line 131 */
v3 = this.t;
v3 = (( c.r.d.c0 ) v3 ).c ( v9 ); // invoke-virtual {v3, v9}, Lc/r/d/c0;->c(Landroid/view/View;)I
/* sub-int v3, v1, v3 */
/* move v11, v0 */
/* move v14, v1 */
/* move v15, v2 */
/* .line 132 */
} // :cond_18
v1 = /* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I */
v3 = this.J;
/* iget v4, v10, Landroidx/recyclerview/widget/GridLayoutManager$b;->e:I */
/* aget v3, v3, v4 */
/* add-int/2addr v1, v3 */
/* .line 133 */
v3 = this.t;
v3 = (( c.r.d.c0 ) v3 ).c ( v9 ); // invoke-virtual {v3, v9}, Lc/r/d/c0;->c(Landroid/view/View;)I
/* add-int/2addr v3, v1 */
/* move v11, v0 */
/* move/from16 v16, v1 */
/* move v15, v2 */
/* move v14, v3 */
/* .line 134 */
} // :cond_19
v0 = /* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/RecyclerView$o;->p()I */
v2 = this.J;
/* iget v4, v10, Landroidx/recyclerview/widget/GridLayoutManager$b;->e:I */
/* aget v2, v2, v4 */
/* add-int/2addr v0, v2 */
/* .line 135 */
v2 = this.t;
v2 = (( c.r.d.c0 ) v2 ).c ( v9 ); // invoke-virtual {v2, v9}, Lc/r/d/c0;->c(Landroid/view/View;)I
/* add-int/2addr v2, v0 */
/* move v15, v0 */
/* move v14, v1 */
/* move v11, v2 */
} // :goto_d
/* move/from16 v16, v3 */
} // :goto_e
/* move-object/from16 v0, p0 */
/* move-object v1, v9 */
/* move/from16 v2, v16 */
/* move v3, v15 */
/* move v4, v14 */
/* move v5, v11 */
/* .line 136 */
/* invoke-virtual/range {v0 ..v5}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;IIII)V */
/* .line 137 */
v0 = (( androidx.recyclerview.widget.RecyclerView$p ) v10 ).c ( ); // invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$p;->c()Z
/* if-nez v0, :cond_1a */
v0 = (( androidx.recyclerview.widget.RecyclerView$p ) v10 ).b ( ); // invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$p;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_1b
/* .line 138 */
} // :cond_1a
/* iput-boolean v8, v7, Landroidx/recyclerview/widget/LinearLayoutManager$b;->c:Z */
/* .line 139 */
} // :cond_1b
/* iget-boolean v0, v7, Landroidx/recyclerview/widget/LinearLayoutManager$b;->d:Z */
v1 = (( android.view.View ) v9 ).hasFocusable ( ); // invoke-virtual {v9}, Landroid/view/View;->hasFocusable()Z
/* or-int/2addr v0, v1 */
/* iput-boolean v0, v7, Landroidx/recyclerview/widget/LinearLayoutManager$b;->d:Z */
/* add-int/lit8 v12, v12, 0x1 */
/* move v0, v11 */
/* move v1, v14 */
/* move v2, v15 */
/* move/from16 v3, v16 */
/* goto/16 :goto_c */
/* .line 140 */
} // :cond_1c
v0 = this.K;
int v1 = 0; // const/4 v1, 0x0
java.util.Arrays .fill ( v0,v1 );
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .line 17 */
p1 = this.N;
(( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).b ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->b()V
/* .line 18 */
p1 = this.N;
(( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a()V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2, java.lang.Object p3 ) {
/* .locals 0 */
/* .line 15 */
p1 = this.N;
(( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).b ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->b()V
/* .line 16 */
p1 = this.N;
(( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a()V
return;
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView$p p0 ) {
/* .locals 0 */
/* .line 23 */
/* instance-of p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$b; */
} // .end method
public Integer b ( Integer p0, androidx.recyclerview.widget.RecyclerView$v p1, androidx.recyclerview.widget.RecyclerView$a0 p2 ) {
/* .locals 0 */
/* .line 7 */
(( androidx.recyclerview.widget.GridLayoutManager ) p0 ).V ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->V()V
/* .line 8 */
(( androidx.recyclerview.widget.GridLayoutManager ) p0 ).U ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->U()V
/* .line 9 */
p1 = /* invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->b(ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I */
} // .end method
public Integer b ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 1 */
/* .line 35 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->P:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 36 */
p1 = (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).l ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->l(Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* .line 37 */
} // :cond_0
p1 = /* invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->b(Landroidx/recyclerview/widget/RecyclerView$a0;)I */
} // .end method
public Integer b ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:I */
/* if-nez v0, :cond_0 */
/* .line 2 */
/* iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* .line 3 */
} // :cond_0
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).a ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
int v1 = 1; // const/4 v1, 0x1
/* if-ge v0, v1, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
} // :cond_1
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).a ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* sub-int/2addr v0, v1 */
p1 = (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
/* add-int/2addr p1, v1 */
} // .end method
public final Integer b ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, Integer p2 ) {
/* .locals 1 */
/* .line 18 */
p2 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).d ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
/* if-nez p2, :cond_0 */
/* .line 19 */
p1 = this.N;
/* iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
p1 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).b ( p3, p2 ); // invoke-virtual {p1, p3, p2}, Landroidx/recyclerview/widget/GridLayoutManager$c;->b(II)I
/* .line 20 */
} // :cond_0
p2 = this.M;
int v0 = -1; // const/4 v0, -0x1
p2 = (( android.util.SparseIntArray ) p2 ).get ( p3, v0 ); // invoke-virtual {p2, p3, v0}, Landroid/util/SparseIntArray;->get(II)I
/* if-eq p2, v0, :cond_1 */
/* .line 21 */
} // :cond_1
p1 = (( androidx.recyclerview.widget.RecyclerView$v ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$v;->a(I)I
/* if-ne p1, v0, :cond_2 */
/* .line 22 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String p2 = "Cannot find span size for pre layout position.It is not cached, not in the adapter.Pos:"; // const-string p2, "Cannot find span size for pre layout position.It is not cached, not in the adapter.Pos:"
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p2 = "GridLayoutManager"; // const-string p2, "GridLayoutManager"
android.util.Log .w ( p2,p1 );
int p1 = 0; // const/4 p1, 0x0
/* .line 23 */
} // :cond_2
p2 = this.N;
/* iget p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
p1 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p2 ).b ( p1, p3 ); // invoke-virtual {p2, p1, p3}, Landroidx/recyclerview/widget/GridLayoutManager$c;->b(II)I
} // .end method
public final void b ( android.view.View p0, Integer p1, Boolean p2 ) {
/* .locals 8 */
/* .line 24 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* .line 25 */
v1 = this.b;
/* .line 26 */
/* iget v2, v1, Landroid/graphics/Rect;->top:I */
/* iget v3, v1, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr v2, v3 */
/* iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v2, v3 */
/* iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v2, v3 */
/* .line 27 */
/* iget v3, v1, Landroid/graphics/Rect;->left:I */
/* iget v1, v1, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v3, v1 */
/* iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v3, v1 */
/* iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v3, v1 */
/* .line 28 */
/* iget v1, v0, Landroidx/recyclerview/widget/GridLayoutManager$b;->e:I */
/* iget v4, v0, Landroidx/recyclerview/widget/GridLayoutManager$b;->f:I */
v1 = (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).h ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->h(II)I
/* .line 29 */
/* iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:I */
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
/* if-ne v4, v6, :cond_0 */
/* .line 30 */
/* iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
p2 = androidx.recyclerview.widget.RecyclerView$o .a ( v1,p2,v3,v4,v5 );
/* .line 31 */
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).g ( ); // invoke-virtual {v1}, Lc/r/d/c0;->g()I
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i()I
/* iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
v0 = androidx.recyclerview.widget.RecyclerView$o .a ( v1,v3,v2,v0,v6 );
/* .line 32 */
} // :cond_0
/* iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
p2 = androidx.recyclerview.widget.RecyclerView$o .a ( v1,p2,v2,v4,v5 );
/* .line 33 */
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).g ( ); // invoke-virtual {v1}, Lc/r/d/c0;->g()I
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).r ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->r()I
/* iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
v0 = androidx.recyclerview.widget.RecyclerView$o .a ( v1,v2,v3,v0,v6 );
/* move v7, v0 */
/* move v0, p2 */
/* move p2, v7 */
/* .line 34 */
} // :goto_0
(( androidx.recyclerview.widget.GridLayoutManager ) p0 ).a ( p1, p2, v0, p3 ); // invoke-virtual {p0, p1, p2, v0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->a(Landroid/view/View;IIZ)V
return;
} // .end method
public final void b ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, androidx.recyclerview.widget.LinearLayoutManager$a p2, Integer p3 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p4, v0, :cond_0 */
int p4 = 1; // const/4 p4, 0x1
} // :cond_0
int p4 = 0; // const/4 p4, 0x0
/* .line 10 */
} // :goto_0
/* iget v1, p3, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I */
v1 = (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).b ( p1, p2, v1 ); // invoke-virtual {p0, p1, p2, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->b(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
if ( p4 != null) { // if-eqz p4, :cond_1
} // :goto_1
/* if-lez v1, :cond_3 */
/* .line 11 */
/* iget p4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I */
/* if-lez p4, :cond_3 */
/* add-int/lit8 p4, p4, -0x1 */
/* .line 12 */
/* iput p4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I */
/* .line 13 */
v1 = (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).b ( p1, p2, p4 ); // invoke-virtual {p0, p1, p2, p4}, Landroidx/recyclerview/widget/GridLayoutManager;->b(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
/* .line 14 */
} // :cond_1
p4 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).a ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* sub-int/2addr p4, v0 */
/* .line 15 */
/* iget v0, p3, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I */
} // :goto_2
/* if-ge v0, p4, :cond_2 */
/* add-int/lit8 v2, v0, 0x1 */
/* .line 16 */
v3 = (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).b ( p1, p2, v2 ); // invoke-virtual {p0, p1, p2, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->b(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;I)I
/* if-le v3, v1, :cond_2 */
/* move v0, v2 */
/* move v1, v3 */
/* .line 17 */
} // :cond_2
/* iput v0, p3, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I */
} // :cond_3
return;
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .line 5 */
p1 = this.N;
(( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).b ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->b()V
/* .line 6 */
p1 = this.N;
(( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a()V
return;
} // .end method
public Integer c ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 1 */
/* .line 14 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->P:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 15 */
p1 = (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).m ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->m(Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* .line 16 */
} // :cond_0
p1 = /* invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Landroidx/recyclerview/widget/RecyclerView$a0;)I */
} // .end method
public final Integer c ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, Integer p2 ) {
/* .locals 1 */
/* .line 8 */
p2 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).d ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
/* if-nez p2, :cond_0 */
/* .line 9 */
p1 = this.N;
p1 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(I)I
/* .line 10 */
} // :cond_0
p2 = this.L;
int v0 = -1; // const/4 v0, -0x1
p2 = (( android.util.SparseIntArray ) p2 ).get ( p3, v0 ); // invoke-virtual {p2, p3, v0}, Landroid/util/SparseIntArray;->get(II)I
/* if-eq p2, v0, :cond_1 */
/* .line 11 */
} // :cond_1
p1 = (( androidx.recyclerview.widget.RecyclerView$v ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$v;->a(I)I
/* if-ne p1, v0, :cond_2 */
/* .line 12 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String p2 = "Cannot find span size for pre layout position.It is not cached, not in the adapter.Pos:"; // const-string p2, "Cannot find span size for pre layout position.It is not cached, not in the adapter.Pos:"
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p2 = "GridLayoutManager"; // const-string p2, "GridLayoutManager"
android.util.Log .w ( p2,p1 );
int p1 = 1; // const/4 p1, 0x1
/* .line 13 */
} // :cond_2
p2 = this.N;
p1 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(I)I
} // .end method
public androidx.recyclerview.widget.RecyclerView$p c ( ) {
/* .locals 3 */
/* .line 5 */
/* iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:I */
int v1 = -2; // const/4 v1, -0x2
int v2 = -1; // const/4 v2, -0x1
/* if-nez v0, :cond_0 */
/* .line 6 */
/* new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager$b;-><init>(II)V */
/* .line 7 */
} // :cond_0
/* new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$b; */
/* invoke-direct {v0, v2, v1}, Landroidx/recyclerview/widget/GridLayoutManager$b;-><init>(II)V */
} // .end method
public void c ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .line 3 */
p1 = this.N;
(( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).b ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->b()V
/* .line 4 */
p1 = this.N;
(( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a()V
return;
} // .end method
public void c ( Boolean p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
/* invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Z)V */
return;
/* .line 2 */
} // :cond_0
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
final String v0 = "GridLayoutManager does not support stack from end.Consider using reverse layout"; // const-string v0, "GridLayoutManager does not support stack from end.Consider using reverse layout"
/* invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void d ( androidx.recyclerview.widget.RecyclerView p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = this.N;
(( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).b ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->b()V
/* .line 2 */
p1 = this.N;
(( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a()V
return;
} // .end method
public Integer e ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 1 */
/* .line 5 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->P:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
p1 = (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).l ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->l(Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* .line 7 */
} // :cond_0
p1 = /* invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->e(Landroidx/recyclerview/widget/RecyclerView$a0;)I */
} // .end method
public void e ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).d ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.recyclerview.widget.GridLayoutManager ) p0 ).S ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->S()V
/* .line 3 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->e(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V */
/* .line 4 */
(( androidx.recyclerview.widget.GridLayoutManager ) p0 ).T ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->T()V
return;
} // .end method
public Integer f ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->P:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p1 = (( androidx.recyclerview.widget.GridLayoutManager ) p0 ).m ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->m(Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* .line 3 */
} // :cond_0
p1 = /* invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->f(Landroidx/recyclerview/widget/RecyclerView$a0;)I */
} // .end method
public void g ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->g(Landroidx/recyclerview/widget/RecyclerView$a0;)V */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->H:Z */
return;
} // .end method
public Integer h ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
v0 = (( androidx.recyclerview.widget.LinearLayoutManager ) p0 ).O ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->O()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.J;
/* iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* sub-int v2, v1, p1 */
/* aget v2, v0, v2 */
/* sub-int/2addr v1, p1 */
/* sub-int/2addr v1, p2 */
/* aget p1, v0, v1 */
/* sub-int/2addr v2, p1 */
/* .line 3 */
} // :cond_0
v0 = this.J;
/* add-int/2addr p2, p1 */
/* aget p2, v0, p2 */
/* aget p1, v0, p1 */
/* sub-int/2addr p2, p1 */
} // .end method
public final Integer l ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 9 */
/* .line 2 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* if-nez v0, :cond_0 */
/* goto/16 :goto_1 */
/* .line 3 */
} // :cond_0
(( androidx.recyclerview.widget.LinearLayoutManager ) p0 ).E ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->E()V
/* .line 4 */
v0 = (( androidx.recyclerview.widget.LinearLayoutManager ) p0 ).P ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->P()Z
/* xor-int/lit8 v2, v0, 0x1 */
int v3 = 1; // const/4 v3, 0x1
/* .line 5 */
(( androidx.recyclerview.widget.LinearLayoutManager ) p0 ).b ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->b(ZZ)Landroid/view/View;
/* xor-int/lit8 v4, v0, 0x1 */
/* .line 6 */
(( androidx.recyclerview.widget.LinearLayoutManager ) p0 ).a ( v4, v3 ); // invoke-virtual {p0, v4, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->a(ZZ)Landroid/view/View;
if ( v2 != null) { // if-eqz v2, :cond_4
/* if-nez v4, :cond_1 */
/* goto/16 :goto_1 */
/* .line 7 */
} // :cond_1
v5 = this.N;
v6 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v2 ); // invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* iget v7, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
v5 = (( androidx.recyclerview.widget.GridLayoutManager$c ) v5 ).a ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(II)I
/* .line 8 */
v6 = this.N;
v7 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v4 ); // invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* iget v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
v6 = (( androidx.recyclerview.widget.GridLayoutManager$c ) v6 ).a ( v7, v8 ); // invoke-virtual {v6, v7, v8}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(II)I
/* .line 9 */
v7 = java.lang.Math .min ( v5,v6 );
/* .line 10 */
v5 = java.lang.Math .max ( v5,v6 );
/* .line 11 */
v6 = this.N;
p1 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* sub-int/2addr p1, v3 */
/* iget v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
p1 = (( androidx.recyclerview.widget.GridLayoutManager$c ) v6 ).a ( p1, v8 ); // invoke-virtual {v6, p1, v8}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(II)I
/* add-int/2addr p1, v3 */
/* .line 12 */
/* iget-boolean v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z */
if ( v6 != null) { // if-eqz v6, :cond_2
/* sub-int/2addr p1, v5 */
/* sub-int/2addr p1, v3 */
/* .line 13 */
p1 = java.lang.Math .max ( v1,p1 );
/* .line 14 */
} // :cond_2
p1 = java.lang.Math .max ( v1,v7 );
} // :goto_0
/* if-nez v0, :cond_3 */
/* .line 15 */
} // :cond_3
v0 = this.t;
v0 = (( c.r.d.c0 ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lc/r/d/c0;->a(Landroid/view/View;)I
v1 = this.t;
/* .line 16 */
v1 = (( c.r.d.c0 ) v1 ).d ( v2 ); // invoke-virtual {v1, v2}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* sub-int/2addr v0, v1 */
/* .line 17 */
v0 = java.lang.Math .abs ( v0 );
/* .line 18 */
v1 = this.N;
/* .line 19 */
v5 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v2 ); // invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
v1 = (( androidx.recyclerview.widget.GridLayoutManager$c ) v1 ).a ( v5, v6 ); // invoke-virtual {v1, v5, v6}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(II)I
/* .line 20 */
v5 = this.N;
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v4 ); // invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
v4 = (( androidx.recyclerview.widget.GridLayoutManager$c ) v5 ).a ( v4, v6 ); // invoke-virtual {v5, v4, v6}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(II)I
/* sub-int/2addr v4, v1 */
/* add-int/2addr v4, v3 */
/* int-to-float v0, v0 */
/* int-to-float v1, v4 */
/* div-float/2addr v0, v1 */
/* int-to-float p1, p1 */
/* mul-float p1, p1, v0 */
/* .line 21 */
v0 = this.t;
v0 = (( c.r.d.c0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/r/d/c0;->f()I
v1 = this.t;
/* .line 22 */
v1 = (( c.r.d.c0 ) v1 ).d ( v2 ); // invoke-virtual {v1, v2}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* sub-int/2addr v0, v1 */
/* int-to-float v0, v0 */
/* add-float/2addr p1, v0 */
/* .line 23 */
p1 = java.lang.Math .round ( p1 );
} // :cond_4
} // :goto_1
} // .end method
public final void l ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.J;
/* iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
androidx.recyclerview.widget.GridLayoutManager .a ( v0,v1,p1 );
this.J = p1;
return;
} // .end method
public final Integer m ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 6 */
/* .line 7 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* if-nez v0, :cond_0 */
/* .line 8 */
} // :cond_0
(( androidx.recyclerview.widget.LinearLayoutManager ) p0 ).E ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->E()V
/* .line 9 */
v0 = (( androidx.recyclerview.widget.LinearLayoutManager ) p0 ).P ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->P()Z
int v2 = 1; // const/4 v2, 0x1
/* xor-int/2addr v0, v2 */
(( androidx.recyclerview.widget.LinearLayoutManager ) p0 ).b ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->b(ZZ)Landroid/view/View;
/* .line 10 */
v3 = (( androidx.recyclerview.widget.LinearLayoutManager ) p0 ).P ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->P()Z
/* xor-int/2addr v3, v2 */
(( androidx.recyclerview.widget.LinearLayoutManager ) p0 ).a ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->a(ZZ)Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_3
/* if-nez v3, :cond_1 */
/* .line 11 */
} // :cond_1
v1 = (( androidx.recyclerview.widget.LinearLayoutManager ) p0 ).P ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->P()Z
/* if-nez v1, :cond_2 */
/* .line 12 */
v0 = this.N;
/* .line 13 */
p1 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* sub-int/2addr p1, v2 */
/* iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* .line 14 */
p1 = (( androidx.recyclerview.widget.GridLayoutManager$c ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(II)I
/* add-int/2addr p1, v2 */
/* .line 15 */
} // :cond_2
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Lc/r/d/c0;->a(Landroid/view/View;)I
v4 = this.t;
/* .line 16 */
v4 = (( c.r.d.c0 ) v4 ).d ( v0 ); // invoke-virtual {v4, v0}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* sub-int/2addr v1, v4 */
/* .line 17 */
v4 = this.N;
/* .line 18 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* iget v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
v0 = (( androidx.recyclerview.widget.GridLayoutManager$c ) v4 ).a ( v0, v5 ); // invoke-virtual {v4, v0, v5}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(II)I
/* .line 19 */
v4 = this.N;
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v3 ); // invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* iget v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
v3 = (( androidx.recyclerview.widget.GridLayoutManager$c ) v4 ).a ( v3, v5 ); // invoke-virtual {v4, v3, v5}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(II)I
/* .line 20 */
v4 = this.N;
p1 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* sub-int/2addr p1, v2 */
/* iget v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
p1 = (( androidx.recyclerview.widget.GridLayoutManager$c ) v4 ).a ( p1, v5 ); // invoke-virtual {v4, p1, v5}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(II)I
/* add-int/2addr p1, v2 */
/* sub-int/2addr v3, v0 */
/* add-int/2addr v3, v2 */
/* int-to-float v0, v1 */
/* int-to-float v1, v3 */
/* div-float/2addr v0, v1 */
/* int-to-float p1, p1 */
/* mul-float v0, v0, p1 */
/* float-to-int p1, v0 */
} // :cond_3
} // :goto_0
} // .end method
public void m ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* if-ne p1, v0, :cond_0 */
return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->H:Z */
/* if-lt p1, v0, :cond_1 */
/* .line 3 */
/* iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:I */
/* .line 4 */
p1 = this.N;
(( androidx.recyclerview.widget.GridLayoutManager$c ) p1 ).b ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->b()V
/* .line 5 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->y()V
return;
/* .line 6 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Span count should be at least 1.Provided "; // const-string v2, "Span count should be at least 1.Provided "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
