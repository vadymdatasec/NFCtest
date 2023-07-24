.class public final Le/f/a/a/i/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/net/URL;

.field public final b:Le/f/a/a/i/b/a0;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/net/URL;Le/f/a/a/i/b/a0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/a/i/e;->a:Ljava/net/URL;

    .line 3
    iput-object p2, p0, Le/f/a/a/i/e;->b:Le/f/a/a/i/b/a0;

    .line 4
    iput-object p3, p0, Le/f/a/a/i/e;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/net/URL;)Le/f/a/a/i/e;
    .locals 3

    .line 1
    new-instance v0, Le/f/a/a/i/e;

    iget-object v1, p0, Le/f/a/a/i/e;->b:Le/f/a/a/i/b/a0;

    iget-object v2, p0, Le/f/a/a/i/e;->c:Ljava/lang/String;

    invoke-direct {v0, p1, v1, v2}, Le/f/a/a/i/e;-><init>(Ljava/net/URL;Le/f/a/a/i/b/a0;Ljava/lang/String;)V

    return-object v0
.end method
