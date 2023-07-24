.class public final enum Le/h/d/a/a/q/d;
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
    .locals 2

    .line 1
    new-instance p3, Le/h/d/a/a/q/b;

    invoke-direct {p3}, Le/h/d/a/a/q/b;-><init>()V

    sget v0, Le/h/d/a/a/c;->notification_transaction_in_progress:I

    .line 2
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Le/h/d/a/a/q/b;->a(Ljava/lang/String;)Le/h/d/a/a/q/b;

    const/4 v0, 0x2

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    .line 3
    invoke-virtual {p3, v0}, Le/h/d/a/a/q/b;->a([J)Le/h/d/a/a/q/b;

    sget v0, Le/h/d/a/a/b;->ic_waitscreen:I

    .line 4
    invoke-virtual {p3, v0}, Le/h/d/a/a/q/b;->b(I)Le/h/d/a/a/q/b;

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p3, v1, v0, v0}, Le/h/d/a/a/q/b;->a(IIZ)Le/h/d/a/a/q/b;

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Le/h/d/a/a/a;->active:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lc/h/f/i/s;->a(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)I

    move-result p1

    invoke-virtual {p3, p1}, Le/h/d/a/a/q/b;->a(I)Le/h/d/a/a/q/b;

    if-nez p2, :cond_0

    const p1, 0x2bf20

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    invoke-virtual {p3, p1}, Le/h/d/a/a/q/b;->c(I)Le/h/d/a/a/q/b;

    return-object p3

    nop

    :array_0
    .array-data 8
        0x0
        0x64
    .end array-data
.end method
