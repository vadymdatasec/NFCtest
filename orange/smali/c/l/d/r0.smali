.class public abstract Lc/l/d/r0;
.super Lc/l/d/n0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lc/l/d/n0;"
    }
.end annotation


# instance fields
.field public final b:Landroid/app/Activity;

.field public final c:Landroid/content/Context;

.field public final d:Landroid/os/Handler;

.field public final e:Lc/l/d/o1;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lc/l/d/n0;-><init>()V

    .line 3
    new-instance p4, Lc/l/d/p1;

    invoke-direct {p4}, Lc/l/d/p1;-><init>()V

    iput-object p4, p0, Lc/l/d/r0;->e:Lc/l/d/o1;

    .line 4
    iput-object p1, p0, Lc/l/d/r0;->b:Landroid/app/Activity;

    const-string p1, "context == null"

    .line 5
    invoke-static {p2, p1}, Lc/h/m/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Landroid/content/Context;

    iput-object p2, p0, Lc/l/d/r0;->c:Landroid/content/Context;

    const-string p1, "handler == null"

    .line 6
    invoke-static {p3, p1}, Lc/h/m/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p3, Landroid/os/Handler;

    iput-object p3, p0, Lc/l/d/r0;->d:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Lc/l/d/f0;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    const/4 v1, 0x0

    invoke-direct {p0, p1, p1, v0, v1}, Lc/l/d/r0;-><init>(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
.end method

.method public abstract a(Landroidx/fragment/app/Fragment;)Z
.end method

.method public e()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/r0;->b:Landroid/app/Activity;

    return-object v0
.end method

.method public h()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/r0;->c:Landroid/content/Context;

    return-object v0
.end method

.method public i()Landroid/os/Handler;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/r0;->d:Landroid/os/Handler;

    return-object v0
.end method

.method public abstract j()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation
.end method

.method public abstract k()Landroid/view/LayoutInflater;
.end method

.method public abstract l()V
.end method
