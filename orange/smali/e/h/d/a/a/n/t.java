public abstract class e.h.d.a.a.n.t {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e.h.d.a.a.n.t a;
	 /* # direct methods */
	 public static e.h.d.a.a.n.t ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/h/d/a/a/n/c; */
		 /* invoke-direct {v0}, Le/h/d/a/a/n/c;-><init>()V */
		 return;
	 } // .end method
	 public e.h.d.a.a.n.t ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.util.Date a ( Integer p0 ) {
		 /* .locals 1 */
		 /* neg-int p0, p0 */
		 /* const/16 v0, 0xe */
		 /* .line 1 */
		 e.h.d.a.a.n.t .a ( v0,p0 );
	 } // .end method
	 public static java.util.Date a ( Integer p0, Integer p1 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 /* new-instance v0, Ljava/util/GregorianCalendar; */
		 /* invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V */
		 /* .line 3 */
		 v1 = e.h.d.a.a.n.t.a;
		 (( e.h.d.a.a.n.t ) v1 ).a ( ); // invoke-virtual {v1}, Le/h/d/a/a/n/t;->a()Ljava/util/Date;
		 (( java.util.Calendar ) v0 ).setTime ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 4 */
		 (( java.util.Calendar ) v0 ).setLenient ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Calendar;->setLenient(Z)V
		 /* .line 5 */
		 (( java.util.Calendar ) v0 ).add ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->add(II)V
		 /* .line 6 */
		 (( java.util.Calendar ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
	 } // .end method
	 public static java.util.Date b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.h.d.a.a.n.t.a;
		 (( e.h.d.a.a.n.t ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/n/t;->a()Ljava/util/Date;
	 } // .end method
	 public static java.util.Date b ( Integer p0 ) {
		 /* .locals 1 */
		 /* neg-int p0, p0 */
		 /* const/16 v0, 0xd */
		 /* .line 2 */
		 e.h.d.a.a.n.t .a ( v0,p0 );
	 } // .end method
	 public static java.util.Date c ( Integer p0 ) {
		 /* .locals 1 */
		 /* const/16 v0, 0xe */
		 /* .line 1 */
		 e.h.d.a.a.n.t .a ( v0,p0 );
	 } // .end method
	 /* # virtual methods */
	 public abstract java.util.Date a ( ) {
	 } // .end method
