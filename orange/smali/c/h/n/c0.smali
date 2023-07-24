.class public Lc/h/n/c0;
.super Lc/h/n/f0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/h/n/f0<",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(ILjava/lang/Class;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lc/h/n/f0;-><init>(ILjava/lang/Class;II)V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 0

    .line 2
    invoke-static {p1}, Lc/h/n/s0;->a(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Landroid/view/View;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/h/n/c0;->a(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
