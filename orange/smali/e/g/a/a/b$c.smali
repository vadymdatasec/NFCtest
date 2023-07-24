.class public final Le/g/a/a/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/g/a/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/os/Handler;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Le/g/a/a/b$c;->a:Landroid/content/Context;

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Le/g/a/a/b$c;->b:Landroid/os/Handler;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Le/g/a/a/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/g/a/a/b$c;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a(Le/g/a/a/b$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/g/a/a/b$c;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Le/g/a/a/b$c;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    iput-object v0, p0, Le/g/a/a/b$c;->c:Ljava/lang/String;

    .line 3
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object v0, p0, Le/g/a/a/b$c;->d:Ljava/lang/String;

    .line 4
    :cond_0
    new-instance v0, Le/g/a/a/d;

    invoke-direct {v0, p0, p1}, Le/g/a/a/d;-><init>(Le/g/a/a/b$c;Le/g/a/a/b$a;)V

    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p1, v1, :cond_1

    .line 6
    new-instance p1, Ljava/lang/Thread;

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v0}, Le/g/a/a/d;->run()V

    :goto_0
    return-void
.end method
