public class c.f.b.a extends c.f.b.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer h;
	 public Integer i;
	 public c.f.a.l.b j;
	 /* # direct methods */
	 public c.f.b.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Lc/f/b/b;-><init>(Landroid/content/Context;)V */
		 /* const/16 p1, 0x8 */
		 /* .line 2 */
		 /* invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.util.AttributeSet p0 ) {
		 /* .locals 6 */
		 /* .line 1 */
		 /* invoke-super {p0, p1}, Lc/f/b/b;->a(Landroid/util/AttributeSet;)V */
		 /* .line 2 */
		 /* new-instance v0, Lc/f/a/l/b; */
		 /* invoke-direct {v0}, Lc/f/a/l/b;-><init>()V */
		 this.j = v0;
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 /* .line 3 */
			 (( android.view.View ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
			 v1 = c.f.b.h.ConstraintLayout_Layout;
			 (( android.content.Context ) v0 ).obtainStyledAttributes ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
			 /* .line 4 */
			 v0 = 			 (( android.content.res.TypedArray ) p1 ).getIndexCount ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I
			 int v1 = 0; // const/4 v1, 0x0
			 int v2 = 0; // const/4 v2, 0x0
		 } // :goto_0
		 /* if-ge v2, v0, :cond_2 */
		 /* .line 5 */
		 v3 = 		 (( android.content.res.TypedArray ) p1 ).getIndex ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I
		 /* .line 6 */
		 /* if-ne v3, v4, :cond_0 */
		 /* .line 7 */
		 v3 = 		 (( android.content.res.TypedArray ) p1 ).getInt ( v3, v1 ); // invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I
		 (( c.f.b.a ) p0 ).setType ( v3 ); // invoke-virtual {p0, v3}, Lc/f/b/a;->setType(I)V
		 /* .line 8 */
	 } // :cond_0
	 /* if-ne v3, v4, :cond_1 */
	 /* .line 9 */
	 v4 = this.j;
	 int v5 = 1; // const/4 v5, 0x1
	 v3 = 	 (( android.content.res.TypedArray ) p1 ).getBoolean ( v3, v5 ); // invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
	 (( c.f.a.l.b ) v4 ).c ( v3 ); // invoke-virtual {v4, v3}, Lc/f/a/l/b;->c(Z)V
} // :cond_1
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
/* .line 10 */
} // :cond_2
p1 = this.j;
this.e = p1;
/* .line 11 */
(( c.f.b.b ) p0 ).a ( ); // invoke-virtual {p0}, Lc/f/b/b;->a()V
return;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
v0 = (( c.f.a.l.b ) v0 ).L ( ); // invoke-virtual {v0}, Lc/f/a/l/b;->L()Z
} // .end method
public Integer getType ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/f/b/a;->h:I */
} // .end method
public void setAllowsGoneWidget ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
(( c.f.a.l.b ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/f/a/l/b;->c(Z)V
return;
} // .end method
public void setType ( Integer p0 ) {
/* .locals 6 */
/* .line 1 */
/* iput p1, p0, Lc/f/b/a;->h:I */
/* .line 2 */
/* iput p1, p0, Lc/f/b/a;->i:I */
/* .line 3 */
int v1 = 6; // const/4 v1, 0x6
int v2 = 5; // const/4 v2, 0x5
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
/* const/16 v5, 0x11 */
/* if-ge v0, v5, :cond_1 */
/* if-ne p1, v2, :cond_0 */
/* .line 4 */
/* iput v3, p0, Lc/f/b/a;->i:I */
} // :cond_0
/* if-ne p1, v1, :cond_6 */
/* .line 5 */
/* iput v4, p0, Lc/f/b/a;->i:I */
/* .line 6 */
} // :cond_1
(( android.view.View ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p1 ).getConfiguration ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* .line 7 */
p1 = (( android.content.res.Configuration ) p1 ).getLayoutDirection ( ); // invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I
/* if-ne v4, p1, :cond_2 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 8 */
/* iget p1, p0, Lc/f/b/a;->h:I */
/* if-ne p1, v2, :cond_3 */
/* .line 9 */
/* iput v4, p0, Lc/f/b/a;->i:I */
} // :cond_3
/* if-ne p1, v1, :cond_6 */
/* .line 10 */
/* iput v3, p0, Lc/f/b/a;->i:I */
/* .line 11 */
} // :cond_4
/* iget p1, p0, Lc/f/b/a;->h:I */
/* if-ne p1, v2, :cond_5 */
/* .line 12 */
/* iput v3, p0, Lc/f/b/a;->i:I */
} // :cond_5
/* if-ne p1, v1, :cond_6 */
/* .line 13 */
/* iput v4, p0, Lc/f/b/a;->i:I */
/* .line 14 */
} // :cond_6
} // :goto_1
p1 = this.j;
/* iget v0, p0, Lc/f/b/a;->i:I */
(( c.f.a.l.b ) p1 ).u ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/l/b;->u(I)V
return;
} // .end method
