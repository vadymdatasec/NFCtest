public class c.b.p.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.content.Context a;
	 /* # direct methods */
	 public c.b.p.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static c.b.p.a a ( android.content.Context p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lc/b/p/a; */
		 /* invoke-direct {v0, p0}, Lc/b/p/a;-><init>(Landroid/content/Context;)V */
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( ) {
		 /* .locals 2 */
		 /* .line 2 */
		 v0 = this.a;
		 (( android.content.Context ) v0 ).getApplicationInfo ( ); // invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
		 /* iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I */
		 /* const/16 v1, 0xe */
		 /* if-ge v0, v1, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* div-int/lit8 v0, v0, 0x2 */
} // .end method
public Integer c ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.a;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* .line 2 */
/* iget v1, v0, Landroid/content/res/Configuration;->screenWidthDp:I */
/* .line 3 */
/* iget v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I */
/* .line 4 */
/* iget v0, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I */
/* const/16 v3, 0x258 */
/* if-gt v0, v3, :cond_6 */
/* if-gt v1, v3, :cond_6 */
/* const/16 v0, 0x2d0 */
/* const/16 v3, 0x3c0 */
/* if-le v1, v3, :cond_0 */
/* if-gt v2, v0, :cond_6 */
} // :cond_0
/* if-le v1, v0, :cond_1 */
/* if-le v2, v3, :cond_1 */
} // :cond_1
/* const/16 v0, 0x1f4 */
/* if-ge v1, v0, :cond_5 */
/* const/16 v0, 0x1e0 */
/* const/16 v3, 0x280 */
/* if-le v1, v3, :cond_2 */
/* if-gt v2, v0, :cond_5 */
} // :cond_2
/* if-le v1, v0, :cond_3 */
/* if-le v2, v3, :cond_3 */
} // :cond_3
/* const/16 v0, 0x168 */
/* if-lt v1, v0, :cond_4 */
int v0 = 3; // const/4 v0, 0x3
} // :cond_4
int v0 = 2; // const/4 v0, 0x2
} // :cond_5
} // :goto_0
int v0 = 4; // const/4 v0, 0x4
} // :cond_6
} // :goto_1
int v0 = 5; // const/4 v0, 0x5
} // .end method
public Boolean d ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v0 = (( android.content.res.Resources ) v0 ).getBoolean ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z
} // .end method
public Boolean e ( ) {
/* .locals 3 */
/* .line 1 */
int v1 = 1; // const/4 v1, 0x1
/* const/16 v2, 0x13 */
/* if-lt v0, v2, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = this.a;
android.view.ViewConfiguration .get ( v0 );
v0 = (( android.view.ViewConfiguration ) v0 ).hasPermanentMenuKey ( ); // invoke-virtual {v0}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z
/* xor-int/2addr v0, v1 */
} // .end method
