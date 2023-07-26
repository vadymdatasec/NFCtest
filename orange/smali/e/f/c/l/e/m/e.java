public class e.f.c.l.e.m.e {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.Float a;
	 public final Boolean b;
	 /* # direct methods */
	 public e.f.c.l.e.m.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput-boolean p2, p0, Le/f/c/l/e/m/e;->b:Z */
		 /* .line 3 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static e.f.c.l.e.m.e a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 /* new-instance v0, Landroid/content/IntentFilter; */
		 final String v1 = "android.intent.action.BATTERY_CHANGED"; // const-string v1, "android.intent.action.BATTERY_CHANGED"
		 /* invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 3 */
		 (( android.content.Context ) p0 ).registerReceiver ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 4 */
			 v0 = 			 e.f.c.l.e.m.e .b ( p0 );
			 /* .line 5 */
			 e.f.c.l.e.m.e .a ( p0 );
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 6 */
	 } // :goto_0
	 /* new-instance p0, Le/f/c/l/e/m/e; */
	 /* invoke-direct {p0, v1, v0}, Le/f/c/l/e/m/e;-><init>(Ljava/lang/Float;Z)V */
} // .end method
public static java.lang.Float a ( android.content.Intent p0 ) {
	 /* .locals 3 */
	 int v0 = -1; // const/4 v0, -0x1
	 final String v1 = "level"; // const-string v1, "level"
	 /* .line 7 */
	 v1 = 	 (( android.content.Intent ) p0 ).getIntExtra ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
	 final String v2 = "scale"; // const-string v2, "scale"
	 /* .line 8 */
	 p0 = 	 (( android.content.Intent ) p0 ).getIntExtra ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
	 /* if-eq v1, v0, :cond_1 */
	 /* if-ne p0, v0, :cond_0 */
} // :cond_0
/* int-to-float v0, v1 */
/* int-to-float p0, p0 */
/* div-float/2addr v0, p0 */
/* .line 9 */
java.lang.Float .valueOf ( v0 );
} // :cond_1
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean b ( android.content.Intent p0 ) {
/* .locals 2 */
int v0 = -1; // const/4 v0, -0x1
final String v1 = "status"; // const-string v1, "status"
/* .line 3 */
p0 = (( android.content.Intent ) p0 ).getIntExtra ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
int v1 = 0; // const/4 v1, 0x0
/* if-ne p0, v0, :cond_0 */
} // :cond_0
int v0 = 2; // const/4 v0, 0x2
/* if-eq p0, v0, :cond_1 */
int v0 = 5; // const/4 v0, 0x5
/* if-ne p0, v0, :cond_2 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
} // .end method
/* # virtual methods */
public java.lang.Float a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public Integer b ( ) {
/* .locals 5 */
/* .line 1 */
/* iget-boolean v0, p0, Le/f/c/l/e/m/e;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.a;
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
/* float-to-double v0, v0 */
/* const-wide v2, 0x3fefae147ae147aeL # 0.99 */
/* cmpg-double v4, v0, v2 */
/* if-gez v4, :cond_1 */
int v0 = 2; // const/4 v0, 0x2
} // :cond_1
int v0 = 3; // const/4 v0, 0x3
} // :cond_2
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
