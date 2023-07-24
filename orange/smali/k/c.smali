.class public interface abstract Lk/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk/b;

    invoke-direct {v0}, Lk/b;-><init>()V

    sput-object v0, Lk/c;->a:Lk/c;

    return-void
.end method


# virtual methods
.method public abstract a(Lk/c1;Lk/z0;)Lk/u0;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
