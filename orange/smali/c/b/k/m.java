public class c.b.k.m {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer A;
	 public Integer B;
	 public Integer C;
	 public Integer D;
	 public Boolean E;
	 public F;
	 public Boolean G;
	 public Boolean H;
	 public Integer I;
	 public android.content.DialogInterface$OnMultiChoiceClickListener J;
	 public android.database.Cursor K;
	 public java.lang.String L;
	 public java.lang.String M;
	 public android.widget.AdapterView$OnItemSelectedListener N;
	 public c.b.k.l O;
	 public final android.content.Context a;
	 public final android.view.LayoutInflater b;
	 public Integer c;
	 public android.graphics.drawable.Drawable d;
	 public Integer e;
	 public java.lang.CharSequence f;
	 public android.view.View g;
	 public java.lang.CharSequence h;
	 public java.lang.CharSequence i;
	 public android.graphics.drawable.Drawable j;
	 public android.content.DialogInterface$OnClickListener k;
	 public java.lang.CharSequence l;
	 public android.graphics.drawable.Drawable m;
	 public android.content.DialogInterface$OnClickListener n;
	 public java.lang.CharSequence o;
	 public android.graphics.drawable.Drawable p;
	 public android.content.DialogInterface$OnClickListener q;
	 public Boolean r;
	 public android.content.DialogInterface$OnCancelListener s;
	 public android.content.DialogInterface$OnDismissListener t;
	 public android.content.DialogInterface$OnKeyListener u;
	 public java.lang.CharSequence v;
	 public android.widget.ListAdapter w;
	 public android.content.DialogInterface$OnClickListener x;
	 public Integer y;
	 public android.view.View z;
	 /* # direct methods */
	 public c.b.k.m ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput v0, p0, Lc/b/k/m;->c:I */
		 /* .line 3 */
		 /* iput v0, p0, Lc/b/k/m;->e:I */
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lc/b/k/m;->E:Z */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 5 */
		 /* iput v0, p0, Lc/b/k/m;->I:I */
		 /* .line 6 */
		 this.a = p1;
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 7 */
		 /* iput-boolean v0, p0, Lc/b/k/m;->r:Z */
		 final String v0 = "layout_inflater"; // const-string v0, "layout_inflater"
		 /* .line 8 */
		 (( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast p1, Landroid/view/LayoutInflater; */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( androidx.appcompat.app.AlertController p0 ) {
		 /* .locals 7 */
		 /* .line 1 */
		 v0 = this.g;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( androidx.appcompat.app.AlertController ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertController;->a(Landroid/view/View;)V
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.f;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 4 */
			 (( androidx.appcompat.app.AlertController ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertController;->b(Ljava/lang/CharSequence;)V
			 /* .line 5 */
		 } // :cond_1
		 v0 = this.d;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 6 */
			 (( androidx.appcompat.app.AlertController ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertController;->a(Landroid/graphics/drawable/Drawable;)V
			 /* .line 7 */
		 } // :cond_2
		 /* iget v0, p0, Lc/b/k/m;->c:I */
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* .line 8 */
			 (( androidx.appcompat.app.AlertController ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertController;->b(I)V
			 /* .line 9 */
		 } // :cond_3
		 /* iget v0, p0, Lc/b/k/m;->e:I */
		 if ( v0 != null) { // if-eqz v0, :cond_4
			 /* .line 10 */
			 v0 = 			 (( androidx.appcompat.app.AlertController ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertController;->a(I)I
			 (( androidx.appcompat.app.AlertController ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertController;->b(I)V
			 /* .line 11 */
		 } // :cond_4
	 } // :goto_0
	 v0 = this.h;
	 if ( v0 != null) { // if-eqz v0, :cond_5
		 /* .line 12 */
		 (( androidx.appcompat.app.AlertController ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertController;->a(Ljava/lang/CharSequence;)V
		 /* .line 13 */
	 } // :cond_5
	 v0 = this.i;
	 /* if-nez v0, :cond_6 */
	 v0 = this.j;
	 if ( v0 != null) { // if-eqz v0, :cond_7
	 } // :cond_6
	 int v2 = -1; // const/4 v2, -0x1
	 /* .line 14 */
	 v3 = this.i;
	 v4 = this.k;
	 int v5 = 0; // const/4 v5, 0x0
	 v6 = this.j;
	 /* move-object v1, p1 */
	 /* invoke-virtual/range {v1 ..v6}, Landroidx/appcompat/app/AlertController;->a(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;Landroid/os/Message;Landroid/graphics/drawable/Drawable;)V */
	 /* .line 15 */
} // :cond_7
v0 = this.l;
/* if-nez v0, :cond_8 */
v0 = this.m;
if ( v0 != null) { // if-eqz v0, :cond_9
} // :cond_8
int v2 = -2; // const/4 v2, -0x2
/* .line 16 */
v3 = this.l;
v4 = this.n;
int v5 = 0; // const/4 v5, 0x0
v6 = this.m;
/* move-object v1, p1 */
/* invoke-virtual/range {v1 ..v6}, Landroidx/appcompat/app/AlertController;->a(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;Landroid/os/Message;Landroid/graphics/drawable/Drawable;)V */
/* .line 17 */
} // :cond_9
v0 = this.o;
/* if-nez v0, :cond_a */
v0 = this.p;
if ( v0 != null) { // if-eqz v0, :cond_b
} // :cond_a
int v2 = -3; // const/4 v2, -0x3
/* .line 18 */
v3 = this.o;
v4 = this.q;
int v5 = 0; // const/4 v5, 0x0
v6 = this.p;
/* move-object v1, p1 */
/* invoke-virtual/range {v1 ..v6}, Landroidx/appcompat/app/AlertController;->a(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;Landroid/os/Message;Landroid/graphics/drawable/Drawable;)V */
/* .line 19 */
} // :cond_b
v0 = this.v;
/* if-nez v0, :cond_c */
v0 = this.K;
/* if-nez v0, :cond_c */
v0 = this.w;
if ( v0 != null) { // if-eqz v0, :cond_d
/* .line 20 */
} // :cond_c
(( c.b.k.m ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/m;->b(Landroidx/appcompat/app/AlertController;)V
/* .line 21 */
} // :cond_d
v2 = this.z;
if ( v2 != null) { // if-eqz v2, :cond_f
/* .line 22 */
/* iget-boolean v0, p0, Lc/b/k/m;->E:Z */
if ( v0 != null) { // if-eqz v0, :cond_e
/* .line 23 */
/* iget v3, p0, Lc/b/k/m;->A:I */
/* iget v4, p0, Lc/b/k/m;->B:I */
/* iget v5, p0, Lc/b/k/m;->C:I */
/* iget v6, p0, Lc/b/k/m;->D:I */
/* move-object v1, p1 */
/* invoke-virtual/range {v1 ..v6}, Landroidx/appcompat/app/AlertController;->a(Landroid/view/View;IIII)V */
/* .line 24 */
} // :cond_e
(( androidx.appcompat.app.AlertController ) p1 ).b ( v2 ); // invoke-virtual {p1, v2}, Landroidx/appcompat/app/AlertController;->b(Landroid/view/View;)V
/* .line 25 */
} // :cond_f
/* iget v0, p0, Lc/b/k/m;->y:I */
if ( v0 != null) { // if-eqz v0, :cond_10
/* .line 26 */
(( androidx.appcompat.app.AlertController ) p1 ).c ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertController;->c(I)V
} // :cond_10
} // :goto_1
return;
} // .end method
public final void b ( androidx.appcompat.app.AlertController p0 ) {
/* .locals 10 */
/* .line 1 */
v0 = this.b;
/* iget v1, p1, Landroidx/appcompat/app/AlertController;->L:I */
int v2 = 0; // const/4 v2, 0x0
/* .line 2 */
(( android.view.LayoutInflater ) v0 ).inflate ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
/* check-cast v0, Landroidx/appcompat/app/AlertController$RecycleListView; */
/* .line 3 */
/* iget-boolean v1, p0, Lc/b/k/m;->G:Z */
int v8 = 1; // const/4 v8, 0x1
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
v1 = this.K;
/* if-nez v1, :cond_0 */
/* .line 5 */
/* new-instance v9, Lc/b/k/h; */
v3 = this.a;
/* iget v4, p1, Landroidx/appcompat/app/AlertController;->M:I */
/* const v5, 0x1020014 */
v6 = this.v;
/* move-object v1, v9 */
/* move-object v2, p0 */
/* move-object v7, v0 */
/* invoke-direct/range {v1 ..v7}, Lc/b/k/h;-><init>(Lc/b/k/m;Landroid/content/Context;II[Ljava/lang/CharSequence;Landroidx/appcompat/app/AlertController$RecycleListView;)V */
/* .line 6 */
} // :cond_0
/* new-instance v9, Lc/b/k/i; */
v3 = this.a;
v4 = this.K;
int v5 = 0; // const/4 v5, 0x0
/* move-object v1, v9 */
/* move-object v2, p0 */
/* move-object v6, v0 */
/* move-object v7, p1 */
/* invoke-direct/range {v1 ..v7}, Lc/b/k/i;-><init>(Lc/b/k/m;Landroid/content/Context;Landroid/database/Cursor;ZLandroidx/appcompat/app/AlertController$RecycleListView;Landroidx/appcompat/app/AlertController;)V */
/* .line 7 */
} // :cond_1
/* iget-boolean v1, p0, Lc/b/k/m;->H:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 8 */
/* iget v1, p1, Landroidx/appcompat/app/AlertController;->N:I */
/* .line 9 */
} // :cond_2
/* iget v1, p1, Landroidx/appcompat/app/AlertController;->O:I */
} // :goto_0
/* move v4, v1 */
/* .line 10 */
v1 = this.K;
/* const v2, 0x1020014 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 11 */
/* new-instance v9, Landroid/widget/SimpleCursorAdapter; */
v3 = this.a;
v5 = this.K;
/* new-array v6, v8, [Ljava/lang/String; */
v1 = this.L;
int v7 = 0; // const/4 v7, 0x0
/* aput-object v1, v6, v7 */
/* new-array v1, v8, [I */
/* aput v2, v1, v7 */
/* move-object v2, v9 */
/* move-object v7, v1 */
/* invoke-direct/range {v2 ..v7}, Landroid/widget/SimpleCursorAdapter;-><init>(Landroid/content/Context;ILandroid/database/Cursor;[Ljava/lang/String;[I)V */
/* .line 12 */
} // :cond_3
v9 = this.w;
if ( v9 != null) { // if-eqz v9, :cond_4
/* .line 13 */
} // :cond_4
/* new-instance v9, Lc/b/k/o; */
v1 = this.a;
v3 = this.v;
/* invoke-direct {v9, v1, v4, v2, v3}, Lc/b/k/o;-><init>(Landroid/content/Context;II[Ljava/lang/CharSequence;)V */
/* .line 14 */
} // :goto_1
v1 = this.O;
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 15 */
/* .line 16 */
} // :cond_5
this.H = v9;
/* .line 17 */
/* iget v1, p0, Lc/b/k/m;->I:I */
/* iput v1, p1, Landroidx/appcompat/app/AlertController;->I:I */
/* .line 18 */
v1 = this.x;
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 19 */
/* new-instance v1, Lc/b/k/j; */
/* invoke-direct {v1, p0, p1}, Lc/b/k/j;-><init>(Lc/b/k/m;Landroidx/appcompat/app/AlertController;)V */
(( android.widget.ListView ) v0 ).setOnItemClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
/* .line 20 */
} // :cond_6
v1 = this.J;
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 21 */
/* new-instance v1, Lc/b/k/k; */
/* invoke-direct {v1, p0, v0, p1}, Lc/b/k/k;-><init>(Lc/b/k/m;Landroidx/appcompat/app/AlertController$RecycleListView;Landroidx/appcompat/app/AlertController;)V */
(( android.widget.ListView ) v0 ).setOnItemClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
/* .line 22 */
} // :cond_7
} // :goto_2
v1 = this.N;
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 23 */
(( android.widget.ListView ) v0 ).setOnItemSelectedListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
/* .line 24 */
} // :cond_8
/* iget-boolean v1, p0, Lc/b/k/m;->H:Z */
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 25 */
(( android.widget.ListView ) v0 ).setChoiceMode ( v8 ); // invoke-virtual {v0, v8}, Landroid/widget/ListView;->setChoiceMode(I)V
/* .line 26 */
} // :cond_9
/* iget-boolean v1, p0, Lc/b/k/m;->G:Z */
if ( v1 != null) { // if-eqz v1, :cond_a
int v1 = 2; // const/4 v1, 0x2
/* .line 27 */
(( android.widget.ListView ) v0 ).setChoiceMode ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ListView;->setChoiceMode(I)V
/* .line 28 */
} // :cond_a
} // :goto_3
this.g = v0;
return;
} // .end method
