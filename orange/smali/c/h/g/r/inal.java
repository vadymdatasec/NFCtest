public class inal extends android.graphics.drawable.Drawable$ConstantState {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer a;
	 public android.graphics.drawable.Drawable$ConstantState b;
	 public android.content.res.ColorStateList c;
	 public android.graphics.PorterDuff$Mode d;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.c = v0;
		 /* .line 3 */
		 v0 = c.h.g.r.d.h;
		 this.d = v0;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 4 */
			 /* iget v0, p1, Lc/h/g/r/f;->a:I */
			 /* iput v0, p0, Lc/h/g/r/f;->a:I */
			 /* .line 5 */
			 v0 = this.b;
			 this.b = v0;
			 /* .line 6 */
			 v0 = this.c;
			 this.c = v0;
			 /* .line 7 */
			 p1 = this.d;
			 this.d = p1;
		 } // :cond_0
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // .end method
public Integer getChangingConfigurations ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* iget v0, p0, Lc/h/g/r/f;->a:I */
	 /* .line 2 */
	 v1 = this.b;
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 v1 = 		 (( android.graphics.drawable.Drawable$ConstantState ) v1 ).getChangingConfigurations ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->getChangingConfigurations()I
	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* or-int/2addr v0, v1 */
} // .end method
public android.graphics.drawable.Drawable newDrawable ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( c.h.g.r.f ) p0 ).newDrawable ( v0 ); // invoke-virtual {p0, v0}, Lc/h/g/r/f;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
} // .end method
public android.graphics.drawable.Drawable newDrawable ( android.content.res.Resources p0 ) {
/* .locals 2 */
/* .line 2 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 3 */
/* new-instance v0, Lc/h/g/r/e; */
/* invoke-direct {v0, p0, p1}, Lc/h/g/r/e;-><init>(Lc/h/g/r/f;Landroid/content/res/Resources;)V */
/* .line 4 */
} // :cond_0
/* new-instance v0, Lc/h/g/r/d; */
/* invoke-direct {v0, p0, p1}, Lc/h/g/r/d;-><init>(Lc/h/g/r/f;Landroid/content/res/Resources;)V */
} // .end method
