.class public abstract Le/b/a/e0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Ljava/util/concurrent/Executor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/e0/g;

    invoke-direct {v0}, Le/b/a/e0/g;-><init>()V

    sput-object v0, Le/b/a/e0/i;->a:Ljava/util/concurrent/Executor;

    .line 2
    new-instance v0, Le/b/a/e0/h;

    invoke-direct {v0}, Le/b/a/e0/h;-><init>()V

    sput-object v0, Le/b/a/e0/i;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static a()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    sget-object v0, Le/b/a/e0/i;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static b()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    sget-object v0, Le/b/a/e0/i;->a:Ljava/util/concurrent/Executor;

    return-object v0
.end method
