.class public abstract Le/f/a/b/h/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Ljava/util/concurrent/Executor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/a/b/h/i;

    invoke-direct {v0}, Le/f/a/b/h/i;-><init>()V

    sput-object v0, Le/f/a/b/h/j;->a:Ljava/util/concurrent/Executor;

    .line 2
    new-instance v0, Le/f/a/b/h/e0;

    invoke-direct {v0}, Le/f/a/b/h/e0;-><init>()V

    sput-object v0, Le/f/a/b/h/j;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
