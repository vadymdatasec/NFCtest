public class inal {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer i;
	 /* # instance fields */
	 public final android.content.Context a;
	 public android.app.ActivityManager b;
	 public e.b.a.y.x.g1.r c;
	 public Float d;
	 public Float e;
	 public Float f;
	 public Float g;
	 public Integer h;
	 /* # direct methods */
	 public static inal ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* const/16 v1, 0x1a */
		 /* if-ge v0, v1, :cond_0 */
		 int v0 = 4; // const/4 v0, 0x4
	 } // :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // :goto_0
return;
} // .end method
public inal ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* const/high16 v0, 0x40000000 # 2.0f */
/* .line 2 */
/* iput v0, p0, Le/b/a/y/x/g1/p;->d:F */
/* .line 3 */
/* int-to-float v0, v0 */
/* iput v0, p0, Le/b/a/y/x/g1/p;->e:F */
/* const v0, 0x3ecccccd # 0.4f */
/* .line 4 */
/* iput v0, p0, Le/b/a/y/x/g1/p;->f:F */
/* const v0, 0x3ea8f5c3 # 0.33f */
/* .line 5 */
/* iput v0, p0, Le/b/a/y/x/g1/p;->g:F */
/* const/high16 v0, 0x400000 */
/* .line 6 */
/* iput v0, p0, Le/b/a/y/x/g1/p;->h:I */
/* .line 7 */
this.a = p1;
final String v0 = "activity"; // const-string v0, "activity"
/* .line 8 */
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/ActivityManager; */
this.b = v0;
/* .line 9 */
/* new-instance v0, Le/b/a/y/x/g1/q; */
/* .line 10 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* invoke-direct {v0, p1}, Le/b/a/y/x/g1/q;-><init>(Landroid/util/DisplayMetrics;)V */
this.c = v0;
/* .line 11 */
/* const/16 v0, 0x1a */
/* if-lt p1, v0, :cond_0 */
p1 = this.b;
p1 = e.b.a.y.x.g1.s .a ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 12 */
	 /* iput p1, p0, Le/b/a/y/x/g1/p;->e:F */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public e.b.a.y.x.g1.s a ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/b/a/y/x/g1/s; */
/* invoke-direct {v0, p0}, Le/b/a/y/x/g1/s;-><init>(Le/b/a/y/x/g1/p;)V */
} // .end method
