public class androidx.preference.SeekBarPreference extends androidx.preference.Preference {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.widget.SeekBar A;
	 public android.widget.TextView B;
	 public Boolean C;
	 public Integer v;
	 public Integer w;
	 public Integer x;
	 public Integer y;
	 public Boolean z;
	 /* # direct methods */
	 public androidx.preference.SeekBarPreference ( ) {
		 /* .locals 1 */
		 /* .line 12 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroidx/preference/SeekBarPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public androidx.preference.SeekBarPreference ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 11 */
		 /* invoke-direct {p0, p1, p2, p3, v0}, Landroidx/preference/SeekBarPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 return;
	 } // .end method
	 public androidx.preference.SeekBarPreference ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 /* .line 2 */
		 /* new-instance v0, Landroidx/preference/SeekBarPreference$a; */
		 /* invoke-direct {v0, p0}, Landroidx/preference/SeekBarPreference$a;-><init>(Landroidx/preference/SeekBarPreference;)V */
		 /* .line 3 */
		 /* new-instance v0, Landroidx/preference/SeekBarPreference$b; */
		 /* invoke-direct {v0, p0}, Landroidx/preference/SeekBarPreference$b;-><init>(Landroidx/preference/SeekBarPreference;)V */
		 /* .line 4 */
		 v0 = c.q.f.SeekBarPreference;
		 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0, p3, p4 ); // invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 /* .line 5 */
		 int p3 = 0; // const/4 p3, 0x0
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getInt ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I
		 /* iput p2, p0, Landroidx/preference/SeekBarPreference;->w:I */
		 /* .line 6 */
		 /* const/16 p4, 0x64 */
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getInt ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Landroid/content/res/TypedArray;->getInt(II)I
		 (( androidx.preference.SeekBarPreference ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Landroidx/preference/SeekBarPreference;->c(I)V
		 /* .line 7 */
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getInt ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I
		 (( androidx.preference.SeekBarPreference ) p0 ).d ( p2 ); // invoke-virtual {p0, p2}, Landroidx/preference/SeekBarPreference;->d(I)V
		 /* .line 8 */
		 int p3 = 1; // const/4 p3, 0x1
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getBoolean ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
		 /* iput-boolean p2, p0, Landroidx/preference/SeekBarPreference;->C:Z */
		 /* .line 9 */
		 (( android.content.res.TypedArray ) p1 ).getBoolean ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
		 /* .line 10 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( android.content.res.TypedArray p0, Integer p1 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 p1 = 		 (( android.content.res.TypedArray ) p1 ).getInt ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I
		 java.lang.Integer .valueOf ( p1 );
	 } // .end method
	 public final void a ( Integer p0, Boolean p1 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 /* iget v0, p0, Landroidx/preference/SeekBarPreference;->w:I */
		 /* if-ge p1, v0, :cond_0 */
		 /* move p1, v0 */
		 /* .line 3 */
	 } // :cond_0
	 /* iget v0, p0, Landroidx/preference/SeekBarPreference;->x:I */
	 /* if-le p1, v0, :cond_1 */
	 /* move p1, v0 */
	 /* .line 4 */
} // :cond_1
/* iget v0, p0, Landroidx/preference/SeekBarPreference;->v:I */
/* if-eq p1, v0, :cond_3 */
/* .line 5 */
/* iput p1, p0, Landroidx/preference/SeekBarPreference;->v:I */
/* .line 6 */
v0 = this.B;
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 7 */
	 java.lang.String .valueOf ( p1 );
	 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 /* .line 8 */
} // :cond_2
(( androidx.preference.Preference ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/preference/Preference;->b(I)Z
if ( p2 != null) { // if-eqz p2, :cond_3
	 /* .line 9 */
	 (( androidx.preference.Preference ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->l()V
} // :cond_3
return;
} // .end method
public void a ( android.widget.SeekBar p0 ) {
/* .locals 2 */
/* .line 10 */
/* iget v0, p0, Landroidx/preference/SeekBarPreference;->w:I */
v1 = (( android.widget.SeekBar ) p1 ).getProgress ( ); // invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I
/* add-int/2addr v0, v1 */
/* .line 11 */
/* iget v1, p0, Landroidx/preference/SeekBarPreference;->v:I */
/* if-eq v0, v1, :cond_1 */
/* .line 12 */
java.lang.Integer .valueOf ( v0 );
v1 = (( androidx.preference.Preference ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Landroidx/preference/Preference;->a(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 13 */
	 (( androidx.preference.SeekBarPreference ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroidx/preference/SeekBarPreference;->a(IZ)V
	 /* .line 14 */
} // :cond_0
/* iget v0, p0, Landroidx/preference/SeekBarPreference;->v:I */
/* iget v1, p0, Landroidx/preference/SeekBarPreference;->w:I */
/* sub-int/2addr v0, v1 */
(( android.widget.SeekBar ) p1 ).setProgress ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V
} // :cond_1
} // :goto_0
return;
} // .end method
public final void c ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/preference/SeekBarPreference;->w:I */
/* if-ge p1, v0, :cond_0 */
/* move p1, v0 */
/* .line 2 */
} // :cond_0
/* iget v0, p0, Landroidx/preference/SeekBarPreference;->x:I */
/* if-eq p1, v0, :cond_1 */
/* .line 3 */
/* iput p1, p0, Landroidx/preference/SeekBarPreference;->x:I */
/* .line 4 */
(( androidx.preference.Preference ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->l()V
} // :cond_1
return;
} // .end method
public final void d ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/preference/SeekBarPreference;->y:I */
/* if-eq p1, v0, :cond_0 */
/* .line 2 */
/* iget v0, p0, Landroidx/preference/SeekBarPreference;->x:I */
/* iget v1, p0, Landroidx/preference/SeekBarPreference;->w:I */
/* sub-int/2addr v0, v1 */
p1 = java.lang.Math .abs ( p1 );
p1 = java.lang.Math .min ( v0,p1 );
/* iput p1, p0, Landroidx/preference/SeekBarPreference;->y:I */
/* .line 3 */
(( androidx.preference.Preference ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->l()V
} // :cond_0
return;
} // .end method
