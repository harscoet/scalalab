import com.google.cloud.bigtable.hbase.adapters.Adapters
import com.google.cloud.bigtable.hbase.adapters.read.DefaultReadHooks
import org.apache.hadoop.hbase.client.Scan

object Main {
  def main(args: Array[String]): Unit = {
    val scan = new Scan
    scan.setMaxVersions()
    scan.addFamily("family".getBytes)
    scan.setRowPrefixFilter("prefix".getBytes)

    val builder = Adapters.SCAN_ADAPTER.adapt(scan, new DefaultReadHooks)

    System.out.println(builder)
  }
}
