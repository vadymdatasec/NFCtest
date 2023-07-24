.class public Le/g/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/g/a/a/d;


# direct methods
.method public constructor <init>(Le/g/a/a/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/g/a/a/c;->b:Le/g/a/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/g/a/a/c;->b:Le/g/a/a/d;

    iget-object v1, v0, Le/g/a/a/d;->b:Le/g/a/a/b$a;

    iget-object v2, v0, Le/g/a/a/d;->c:Le/g/a/a/b$b;

    iget-object v0, v0, Le/g/a/a/d;->d:Ljava/lang/Exception;

    invoke-interface {v1, v2, v0}, Le/g/a/a/b$a;->a(Le/g/a/a/b$b;Ljava/lang/Exception;)V

    return-void
.end method
