public class c.w.a.a.u extends android.graphics.drawable.Drawable$ConstantState {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer a;
	 public c.w.a.a.t b;
	 public android.content.res.ColorStateList c;
	 public android.graphics.PorterDuff$Mode d;
	 public Boolean e;
	 public android.graphics.Bitmap f;
	 public android.content.res.ColorStateList g;
	 public android.graphics.PorterDuff$Mode h;
	 public Integer i;
	 public Boolean j;
	 public Boolean k;
	 public android.graphics.Paint l;
	 /* # direct methods */
	 public c.w.a.a.u ( ) {
		 /* .locals 1 */
		 /* .line 13 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 14 */
		 this.c = v0;
		 /* .line 15 */
		 v0 = c.w.a.a.w.k;
		 this.d = v0;
		 /* .line 16 */
		 /* new-instance v0, Lc/w/a/a/t; */
		 /* invoke-direct {v0}, Lc/w/a/a/t;-><init>()V */
		 this.b = v0;
		 return;
	 } // .end method
	 public c.w.a.a.u ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.c = v0;
		 /* .line 3 */
		 v0 = c.w.a.a.w.k;
		 this.d = v0;
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 /* .line 4 */
			 /* iget v0, p1, Lc/w/a/a/u;->a:I */
			 /* iput v0, p0, Lc/w/a/a/u;->a:I */
			 /* .line 5 */
			 /* new-instance v0, Lc/w/a/a/t; */
			 v1 = this.b;
			 /* invoke-direct {v0, v1}, Lc/w/a/a/t;-><init>(Lc/w/a/a/t;)V */
			 this.b = v0;
			 /* .line 6 */
			 v1 = this.b;
			 v1 = this.e;
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 7 */
				 /* new-instance v1, Landroid/graphics/Paint; */
				 v2 = this.b;
				 v2 = this.e;
				 /* invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V */
				 this.e = v1;
				 /* .line 8 */
			 } // :cond_0
			 v0 = this.b;
			 v0 = this.d;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 9 */
				 v0 = this.b;
				 /* new-instance v1, Landroid/graphics/Paint; */
				 v2 = this.b;
				 v2 = this.d;
				 /* invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V */
				 this.d = v1;
				 /* .line 10 */
			 } // :cond_1
			 v0 = this.c;
			 this.c = v0;
			 /* .line 11 */
			 v0 = this.d;
			 this.d = v0;
			 /* .line 12 */
			 /* iget-boolean p1, p1, Lc/w/a/a/u;->e:Z */
			 /* iput-boolean p1, p0, Lc/w/a/a/u;->e:Z */
		 } // :cond_2
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.graphics.Paint a ( android.graphics.ColorFilter p0 ) {
		 /* .locals 2 */
		 /* .line 3 */
		 v0 = 		 (( c.w.a.a.u ) p0 ).b ( ); // invoke-virtual {p0}, Lc/w/a/a/u;->b()Z
		 /* if-nez v0, :cond_0 */
		 /* if-nez p1, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 4 */
	 } // :cond_0
	 v0 = this.l;
	 /* if-nez v0, :cond_1 */
	 /* .line 5 */
	 /* new-instance v0, Landroid/graphics/Paint; */
	 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
	 this.l = v0;
	 int v1 = 1; // const/4 v1, 0x1
	 /* .line 6 */
	 (( android.graphics.Paint ) v0 ).setFilterBitmap ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V
	 /* .line 7 */
} // :cond_1
v0 = this.l;
v1 = this.b;
v1 = (( c.w.a.a.t ) v1 ).getRootAlpha ( ); // invoke-virtual {v1}, Lc/w/a/a/t;->getRootAlpha()I
(( android.graphics.Paint ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
/* .line 8 */
v0 = this.l;
(( android.graphics.Paint ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
/* .line 9 */
p1 = this.l;
} // .end method
public void a ( android.graphics.Canvas p0, android.graphics.ColorFilter p1, android.graphics.Rect p2 ) {
/* .locals 2 */
/* .line 1 */
(( c.w.a.a.u ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/w/a/a/u;->a(Landroid/graphics/ColorFilter;)Landroid/graphics/Paint;
/* .line 2 */
v0 = this.f;
int v1 = 0; // const/4 v1, 0x0
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, p3, p2 ); // invoke-virtual {p1, v0, v1, p3, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
return;
} // .end method
public Boolean a ( ) {
/* .locals 2 */
/* .line 12 */
/* iget-boolean v0, p0, Lc/w/a/a/u;->k:Z */
/* if-nez v0, :cond_0 */
v0 = this.g;
v1 = this.c;
/* if-ne v0, v1, :cond_0 */
v0 = this.h;
v1 = this.d;
/* if-ne v0, v1, :cond_0 */
/* iget-boolean v0, p0, Lc/w/a/a/u;->j:Z */
/* iget-boolean v1, p0, Lc/w/a/a/u;->e:Z */
/* if-ne v0, v1, :cond_0 */
/* iget v0, p0, Lc/w/a/a/u;->i:I */
v1 = this.b;
/* .line 13 */
v1 = (( c.w.a.a.t ) v1 ).getRootAlpha ( ); // invoke-virtual {v1}, Lc/w/a/a/t;->getRootAlpha()I
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean a ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .line 10 */
v0 = this.f;
v0 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
/* if-ne p1, v0, :cond_0 */
p1 = this.f;
/* .line 11 */
p1 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
/* if-ne p2, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean a ( Integer[] p0 ) {
/* .locals 1 */
/* .line 14 */
v0 = this.b;
p1 = (( c.w.a.a.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/w/a/a/t;->a([I)Z
/* .line 15 */
/* iget-boolean v0, p0, Lc/w/a/a/u;->k:Z */
/* or-int/2addr v0, p1 */
/* iput-boolean v0, p0, Lc/w/a/a/u;->k:Z */
} // .end method
public void b ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.w.a.a.u ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/w/a/a/u;->a(II)Z
/* if-nez v0, :cond_1 */
/* .line 3 */
} // :cond_0
v0 = android.graphics.Bitmap$Config.ARGB_8888;
android.graphics.Bitmap .createBitmap ( p1,p2,v0 );
this.f = p1;
int p1 = 1; // const/4 p1, 0x1
/* .line 4 */
/* iput-boolean p1, p0, Lc/w/a/a/u;->k:Z */
} // :cond_1
return;
} // .end method
public Boolean b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
v0 = (( c.w.a.a.t ) v0 ).getRootAlpha ( ); // invoke-virtual {v0}, Lc/w/a/a/t;->getRootAlpha()I
/* const/16 v1, 0xff */
/* if-ge v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void c ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.f;
int v1 = 0; // const/4 v1, 0x0
(( android.graphics.Bitmap ) v0 ).eraseColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V
/* .line 2 */
/* new-instance v0, Landroid/graphics/Canvas; */
v1 = this.f;
/* invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 3 */
v1 = this.b;
int v2 = 0; // const/4 v2, 0x0
(( c.w.a.a.t ) v1 ).a ( v0, p1, p2, v2 ); // invoke-virtual {v1, v0, p1, p2, v2}, Lc/w/a/a/t;->a(Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V
return;
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* .line 4 */
v0 = this.b;
v0 = (( c.w.a.a.t ) v0 ).a ( ); // invoke-virtual {v0}, Lc/w/a/a/t;->a()Z
} // .end method
public void d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
this.g = v0;
/* .line 2 */
v0 = this.d;
this.h = v0;
/* .line 3 */
v0 = this.b;
v0 = (( c.w.a.a.t ) v0 ).getRootAlpha ( ); // invoke-virtual {v0}, Lc/w/a/a/t;->getRootAlpha()I
/* iput v0, p0, Lc/w/a/a/u;->i:I */
/* .line 4 */
/* iget-boolean v0, p0, Lc/w/a/a/u;->e:Z */
/* iput-boolean v0, p0, Lc/w/a/a/u;->j:Z */
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
/* iput-boolean v0, p0, Lc/w/a/a/u;->k:Z */
return;
} // .end method
public Integer getChangingConfigurations ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/w/a/a/u;->a:I */
} // .end method
public android.graphics.drawable.Drawable newDrawable ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/w/a/a/w; */
/* invoke-direct {v0, p0}, Lc/w/a/a/w;-><init>(Lc/w/a/a/u;)V */
} // .end method
public android.graphics.drawable.Drawable newDrawable ( android.content.res.Resources p0 ) {
/* .locals 0 */
/* .line 2 */
/* new-instance p1, Lc/w/a/a/w; */
/* invoke-direct {p1, p0}, Lc/w/a/a/w;-><init>(Lc/w/a/a/u;)V */
} // .end method
