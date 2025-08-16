package Tasks.June23Tasks;

import java.util.Scanner;

public class DomainBased {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String domainURL = "";

        while(true)
        {
            System.out.println("Enter the domain url: ");
            domainURL = scanner.next().trim().toLowerCase();
            if(domainURL.contains(".com") || domainURL.contains(".org")
                    || domainURL.contains(".edu") || domainURL.contains(".gov")
                    || domainURL.contains(".net") || domainURL.contains("info"))
            {
                break;
            }
            else
            {
                System.out.println("Enter a valid domain url!");
            }
        }

        if(domainURL.contains(".com"))
        {
            System.out.println("The website type is: Commercial website");
        }
        else if (domainURL.contains("org"))
        {
            System.out.println("The website type is: Non-profit organization");
        }
        else if (domainURL.contains("edu"))
        {
            System.out.println("The website type is: Educational institution");
        }
        else if (domainURL.contains("gov"))
        {
            System.out.println("The website type is: Government website");
        }
        else if (domainURL.contains("net"))
        {
            System.out.println("The website type is: Network-related website");
        }
        else if (domainURL.contains("info"))
        {
            System.out.println("The website type is: Informational website");
        }
        else
        {
            System.out.println("The website type is: Unknown or other types of websites");
        }
    }
}
