.class public Le/b/a/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/b/a/u;


# direct methods
.method public constructor <init>(Le/b/a/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/t;->b:Le/b/a/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/t;->b:Le/b/a/u;

    iget-object v1, v0, Le/b/a/u;->d:Le/b/a/z/m;

    invoke-interface {v1, v0}, Le/b/a/z/m;->a(Le/b/a/z/n;)V

    return-void
.end method
