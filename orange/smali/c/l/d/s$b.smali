.class public Lc/l/d/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/l/d/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lc/l/d/s;


# direct methods
.method public constructor <init>(Lc/l/d/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/s$b;->b:Lc/l/d/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lc/l/d/s$b;->b:Lc/l/d/s;

    invoke-static {p1}, Lc/l/d/s;->a(Lc/l/d/s;)Landroid/app/Dialog;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/l/d/s$b;->b:Lc/l/d/s;

    invoke-static {p1}, Lc/l/d/s;->a(Lc/l/d/s;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc/l/d/s;->onCancel(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
