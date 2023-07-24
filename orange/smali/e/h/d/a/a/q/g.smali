.class public final enum Le/h/d/a/a/q/g;
.super Le/h/d/a/a/q/i;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Le/h/d/a/a/q/i;-><init>(Ljava/lang/String;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Le/h/d/a/a/q/d;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;)Le/h/d/a/a/q/b;
    .locals 1

    .line 1
    invoke-static {p1}, Le/h/a/a/a/a/a;->a(Landroid/content/Context;)Le/h/a/a/a/a/a;

    move-result-object p2

    .line 2
    new-instance p3, Le/h/d/a/a/q/b;

    invoke-direct {p3}, Le/h/d/a/a/q/b;-><init>()V

    sget v0, Le/h/d/a/a/c;->notification_transaction_done:I

    .line 3
    invoke-virtual {p2, v0}, Le/h/a/a/a/a/a;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Le/h/d/a/a/q/b;->a(Ljava/lang/String;)Le/h/d/a/a/q/b;

    const/4 p2, 0x2

    new-array p2, p2, [J

    fill-array-data p2, :array_0

    .line 4
    invoke-virtual {p3, p2}, Le/h/d/a/a/q/b;->a([J)Le/h/d/a/a/q/b;

    const/4 p2, 0x1

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p3, p2, p2, v0}, Le/h/d/a/a/q/b;->a(IIZ)Le/h/d/a/a/q/b;

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Le/h/d/a/a/a;->active:I

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lc/h/f/i/s;->a(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)I

    move-result p1

    invoke-virtual {p3, p1}, Le/h/d/a/a/q/b;->a(I)Le/h/d/a/a/q/b;

    sget p1, Le/h/d/a/a/b;->ic_waitscreen:I

    .line 7
    invoke-virtual {p3, p1}, Le/h/d/a/a/q/b;->b(I)Le/h/d/a/a/q/b;

    const/16 p1, 0x3e8

    .line 8
    invoke-virtual {p3, p1}, Le/h/d/a/a/q/b;->c(I)Le/h/d/a/a/q/b;

    return-object p3

    nop

    :array_0
    .array-data 8
        0x0
        0x64
    .end array-data
.end method
