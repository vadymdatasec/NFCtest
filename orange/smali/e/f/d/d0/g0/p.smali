.class public abstract Le/f/d/d0/g0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/d/d0/g0/p;->a:Ljava/lang/String;

    .line 3
    iput-boolean p2, p0, Le/f/d/d0/g0/p;->b:Z

    .line 4
    iput-boolean p3, p0, Le/f/d/d0/g0/p;->c:Z

    return-void
.end method


# virtual methods
.method public abstract a(Le/f/d/f0/c;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation
.end method

.method public abstract a(Le/f/d/f0/g;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation
.end method
