.class public Le/c/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Le/c/a/b;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Le/c/a/b;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le/c/a/a;->a:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Le/c/a/a;->c:Ljava/lang/String;

    .line 4
    iput-object p1, p0, Le/c/a/a;->a:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Le/c/a/a;->b:Le/c/a/b;

    .line 6
    iput-object p3, p0, Le/c/a/a;->c:Ljava/lang/String;

    return-void
.end method
