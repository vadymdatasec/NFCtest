.class public Lc/l/d/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


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
    iput-object p1, p0, Lc/l/d/s$a;->b:Lc/l/d/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/l/d/s$a;->b:Lc/l/d/s;

    invoke-static {v0}, Lc/l/d/s;->b(Lc/l/d/s;)Landroid/content/DialogInterface$OnDismissListener;

    move-result-object v0

    iget-object v1, p0, Lc/l/d/s$a;->b:Lc/l/d/s;

    invoke-static {v1}, Lc/l/d/s;->a(Lc/l/d/s;)Landroid/app/Dialog;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    return-void
.end method
