.class public final Lc/h/n/v1/a;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field public final b:I

.field public final c:Lc/h/n/v1/h;

.field public final d:I


# direct methods
.method public constructor <init>(ILc/h/n/v1/h;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 2
    iput p1, p0, Lc/h/n/v1/a;->b:I

    .line 3
    iput-object p2, p0, Lc/h/n/v1/a;->c:Lc/h/n/v1/h;

    .line 4
    iput p3, p0, Lc/h/n/v1/a;->d:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 2
    iget v0, p0, Lc/h/n/v1/a;->b:I

    const-string v1, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 3
    iget-object v0, p0, Lc/h/n/v1/a;->c:Lc/h/n/v1/h;

    iget v1, p0, Lc/h/n/v1/a;->d:I

    invoke-virtual {v0, v1, p1}, Lc/h/n/v1/h;->a(ILandroid/os/Bundle;)Z

    return-void
.end method
