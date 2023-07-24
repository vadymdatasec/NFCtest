.class public Le/h/b/a/o/a;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/h/b/a/o/a$a;
    }
.end annotation


# instance fields
.field public Z:I

.field public a0:I

.field public b0:Le/h/b/a/o/a$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Le/h/b/a/o/a;->Z:I

    .line 3
    iput v0, p0, Le/h/b/a/o/a;->a0:I

    return-void
.end method

.method public static A0()Le/h/b/a/o/a;
    .locals 4

    .line 1
    new-instance v0, Le/h/b/a/o/a;

    invoke-direct {v0}, Le/h/b/a/o/a;-><init>()V

    .line 2
    sget-object v1, Le/h/b/a/o/a$a;->f:Le/h/b/a/o/a$a;

    const v2, 0x7f0e010a

    const v3, 0x7f0e0107

    invoke-virtual {v0, v2, v3, v1}, Le/h/b/a/o/a;->a(IILe/h/b/a/o/a$a;)V

    return-object v0
.end method

.method public static B0()Le/h/b/a/o/a;
    .locals 4

    .line 1
    new-instance v0, Le/h/b/a/o/a;

    invoke-direct {v0}, Le/h/b/a/o/a;-><init>()V

    .line 2
    sget-object v1, Le/h/b/a/o/a$a;->e:Le/h/b/a/o/a$a;

    const v2, 0x7f0e0103

    const v3, 0x7f0e0101

    invoke-virtual {v0, v2, v3, v1}, Le/h/b/a/o/a;->a(IILe/h/b/a/o/a$a;)V

    return-object v0
.end method

.method public static C0()Le/h/b/a/o/a;
    .locals 4

    .line 1
    new-instance v0, Le/h/b/a/o/a;

    invoke-direct {v0}, Le/h/b/a/o/a;-><init>()V

    .line 2
    sget-object v1, Le/h/b/a/o/a$a;->b:Le/h/b/a/o/a$a;

    const v2, 0x7f0e0096

    const v3, 0x7f0e0095

    invoke-virtual {v0, v2, v3, v1}, Le/h/b/a/o/a;->a(IILe/h/b/a/o/a$a;)V

    return-object v0
.end method

.method public static D0()Le/h/b/a/o/a;
    .locals 4

    .line 1
    new-instance v0, Le/h/b/a/o/a;

    invoke-direct {v0}, Le/h/b/a/o/a;-><init>()V

    .line 2
    sget-object v1, Le/h/b/a/o/a$a;->d:Le/h/b/a/o/a$a;

    const v2, 0x7f0e010d

    const v3, 0x7f0e010e

    invoke-virtual {v0, v2, v3, v1}, Le/h/b/a/o/a;->a(IILe/h/b/a/o/a$a;)V

    return-object v0
.end method

.method public static E0()Le/h/b/a/o/a;
    .locals 4

    .line 1
    new-instance v0, Le/h/b/a/o/a;

    invoke-direct {v0}, Le/h/b/a/o/a;-><init>()V

    .line 2
    sget-object v1, Le/h/b/a/o/a$a;->c:Le/h/b/a/o/a$a;

    const v2, 0x7f0e0113

    const v3, 0x7f0e0111

    invoke-virtual {v0, v2, v3, v1}, Le/h/b/a/o/a;->a(IILe/h/b/a/o/a$a;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const p3, 0x7f0b0041

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f080168

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    const p3, 0x7f08007a

    .line 6
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 7
    iget v0, p0, Le/h/b/a/o/a;->Z:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v2, p0, Le/h/b/a/o/a;->a0:I

    if-eq v2, v1, :cond_0

    .line 8
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 9
    iget p2, p0, Le/h/b/a/o/a;->a0:I

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(I)V

    .line 10
    :cond_0
    new-instance p2, Landroid/text/method/ScrollingMovementMethod;

    invoke-direct {p2}, Landroid/text/method/ScrollingMovementMethod;-><init>()V

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    return-object p1
.end method

.method public final a(IILe/h/b/a/o/a$a;)V
    .locals 0

    .line 1
    iput p1, p0, Le/h/b/a/o/a;->Z:I

    .line 2
    iput p2, p0, Le/h/b/a/o/a;->a0:I

    .line 3
    iput-object p3, p0, Le/h/b/a/o/a;->b0:Le/h/b/a/o/a$a;

    return-void
.end method

.method public z0()Le/h/b/a/o/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/b/a/o/a;->b0:Le/h/b/a/o/a$a;

    return-object v0
.end method
