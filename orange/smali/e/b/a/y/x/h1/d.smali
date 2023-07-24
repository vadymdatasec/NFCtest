.class public final Le/b/a/y/x/h1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Le/b/a/y/x/h1/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/b/a/y/x/h1/d;-><init>()V

    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 1

    .line 1
    new-instance v0, Le/b/a/y/x/h1/c;

    invoke-direct {v0, p0, p1}, Le/b/a/y/x/h1/c;-><init>(Le/b/a/y/x/h1/d;Ljava/lang/Runnable;)V

    return-object v0
.end method
