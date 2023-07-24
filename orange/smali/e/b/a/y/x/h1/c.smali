.class public Le/b/a/y/x/h1/c;
.super Ljava/lang/Thread;
.source "SourceFile"


# direct methods
.method public constructor <init>(Le/b/a/y/x/h1/d;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    const/16 v0, 0x9

    .line 1
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 2
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    return-void
.end method
