.class public Le/b/a/y/x/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/b/a/y/x/f;


# direct methods
.method public constructor <init>(Le/b/a/y/x/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/y/x/c;->b:Le/b/a/y/x/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/c;->b:Le/b/a/y/x/f;

    invoke-virtual {v0}, Le/b/a/y/x/f;->a()V

    return-void
.end method
