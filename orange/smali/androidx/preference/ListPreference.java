public class androidx.preference.ListPreference extends androidx.preference.DialogPreference {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean A;
	 public java.lang.CharSequence w;
	 public java.lang.CharSequence x;
	 public java.lang.String y;
	 public java.lang.String z;
	 /* # direct methods */
	 public androidx.preference.ListPreference ( ) {
		 /* .locals 2 */
		 /* .line 10 */
		 /* const v1, 0x1010091 */
		 v0 = 		 c.h.f.i.t .a ( p1,v0,v1 );
		 /* invoke-direct {p0, p1, p2, v0}, Landroidx/preference/ListPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public androidx.preference.ListPreference ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 9 */
		 /* invoke-direct {p0, p1, p2, p3, v0}, Landroidx/preference/ListPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 return;
	 } // .end method
	 public androidx.preference.ListPreference ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Landroidx/preference/DialogPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 /* .line 2 */
		 v0 = c.q.f.ListPreference;
		 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0, p3, p4 ); // invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 /* .line 3 */
		 c.h.f.i.t .d ( v0,v1,v2 );
		 this.w = v1;
		 /* .line 4 */
		 c.h.f.i.t .d ( v0,v1,v2 );
		 this.x = v1;
		 /* .line 5 */
		 (( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
		 /* .line 6 */
		 v0 = c.q.f.Preference;
		 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0, p3, p4 ); // invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 /* .line 7 */
		 c.h.f.i.t .b ( p1,p2,p3 );
		 this.z = p2;
		 /* .line 8 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( android.content.res.TypedArray p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.content.res.TypedArray ) p1 ).getString ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
	 } // .end method
	 public Integer c ( java.lang.String p0 ) {
		 /* .locals 2 */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 1 */
			 v0 = this.x;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 2 */
				 /* array-length v0, v0 */
				 /* add-int/lit8 v0, v0, -0x1 */
			 } // :goto_0
			 /* if-ltz v0, :cond_1 */
			 /* .line 3 */
			 v1 = this.x;
			 /* aget-object v1, v1, v0 */
			 v1 = 			 (( java.lang.Object ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_0
			 } // :cond_0
			 /* add-int/lit8 v0, v0, -0x1 */
		 } // :cond_1
		 int p1 = -1; // const/4 p1, -0x1
	 } // .end method
	 public void d ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.y;
		 v0 = 		 android.text.TextUtils .equals ( v0,p1 );
		 int v1 = 1; // const/4 v1, 0x1
		 /* xor-int/2addr v0, v1 */
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 /* iget-boolean v2, p0, Landroidx/preference/ListPreference;->A:Z */
		 /* if-nez v2, :cond_1 */
		 /* .line 3 */
	 } // :cond_0
	 this.y = p1;
	 /* .line 4 */
	 /* iput-boolean v1, p0, Landroidx/preference/ListPreference;->A:Z */
	 /* .line 5 */
	 (( androidx.preference.Preference ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/preference/Preference;->b(Ljava/lang/String;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 6 */
		 (( androidx.preference.Preference ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->l()V
	 } // :cond_1
	 return;
} // .end method
public java.lang.CharSequence g ( ) {
	 /* .locals 4 */
	 /* .line 1 */
	 (( androidx.preference.ListPreference ) p0 ).r ( ); // invoke-virtual {p0}, Landroidx/preference/ListPreference;->r()Ljava/lang/CharSequence;
	 /* .line 2 */
	 v1 = this.z;
	 /* if-nez v1, :cond_0 */
	 /* .line 3 */
	 /* invoke-super {p0}, Landroidx/preference/Preference;->g()Ljava/lang/CharSequence; */
} // :cond_0
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* if-nez v0, :cond_1 */
final String v0 = ""; // const-string v0, ""
} // :cond_1
/* aput-object v0, v2, v3 */
/* .line 4 */
java.lang.String .format ( v1,v2 );
} // .end method
public java.lang.CharSequence q ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.w;
} // .end method
public java.lang.CharSequence r ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( androidx.preference.ListPreference ) p0 ).u ( ); // invoke-virtual {p0}, Landroidx/preference/ListPreference;->u()I
/* if-ltz v0, :cond_0 */
/* .line 2 */
v1 = this.w;
if ( v1 != null) { // if-eqz v1, :cond_0
/* aget-object v0, v1, v0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.lang.CharSequence s ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.x;
} // .end method
public java.lang.String t ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.y;
} // .end method
public final Integer u ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.y;
v0 = (( androidx.preference.ListPreference ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/preference/ListPreference;->c(Ljava/lang/String;)I
} // .end method
